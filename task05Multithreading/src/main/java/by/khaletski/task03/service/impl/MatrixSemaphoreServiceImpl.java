package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class MatrixSemaphoreServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value, int threads) {
        AtomicInteger atomicCounter = new AtomicInteger(0);
        Semaphore semaphore = new Semaphore(1);
        for (int i = 0; i < threads; i++) {
            MyThread myThread = new MyThread(semaphore, matrix, value, atomicCounter);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return matrix;
    }

    public class MyThread extends Thread {
        Semaphore semaphore;
        Matrix matrix;
        int value;
        AtomicInteger atomicCounter;

        public MyThread(Semaphore semaphore, Matrix matrix, int value, AtomicInteger atomicCounter) {
            this.semaphore = semaphore;
            this.matrix = matrix;
            this.value = value;
            this.atomicCounter = atomicCounter;
        }

        @Override
        public void run() {
            while (atomicCounter.get() < matrix.getHorizontalSize()) {
                try {
                    matrix.setElement(atomicCounter.get(), atomicCounter.get(), value);
                } catch (MatrixException e) {
                    e.printStackTrace();
                }
                increaseCounterAndLock();
            }
        }

        private void increaseCounterAndLock() {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " changed element "
                        + atomicCounter.getAndIncrement());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
