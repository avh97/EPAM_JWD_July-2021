package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
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
            System.out.println("Start " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " is running");
            for (int i = 0; i < matrix.getHorizontalSize(); i++) {
                try {
                    semaphore.acquire();
                    if (matrix.getElement(i, i) != value) {
                        matrix.setElement(i, i, value);
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
                } catch (InterruptedException | MatrixException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();

                }
            }
            System.out.println(Thread.currentThread().getName() + " stopped");
        }
    }
}
