package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class MatrixReentrantLockServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value, int threads) {
        AtomicInteger atomicCounter = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        Thread threadArray[] = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            threadArray[i] = new Thread(new MyThread(matrix, value, reentrantLock, atomicCounter), "Thread " + i);
            System.out.println("Thread " + i + " has been created");
        }
        for (int i = 0; i < threads; i++) {
            threadArray[i].start();
        }
        return matrix;
    }

    public class MyThread implements Runnable {
        ReentrantLock reentrantLock;
        Matrix matrix;
        int value;
        AtomicInteger atomicCounter;

        public MyThread(Matrix matrix, int value, ReentrantLock reentrantLock, AtomicInteger atomicCounter) {
            this.matrix = matrix;
            this.value = value;
            this.reentrantLock = reentrantLock;
            this.atomicCounter = atomicCounter;
        }

        @Override
        public void run() {
//            reentrantLock.lock();
            System.out.println("Start " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " is running");
            while (atomicCounter.get() < matrix.getHorizontalSize()) {
                try {
                    matrix.setElement(atomicCounter.get(), atomicCounter.get(), value);
                } catch (MatrixException e) {
                    e.printStackTrace();
                } finally {
                    increaseCounterAndLock();
                }
            }
//            reentrantLock.unlock();
            System.out.println(Thread.currentThread().getName() + " stopped");
        }

        private void increaseCounterAndLock() {
            try {
                reentrantLock.lock();
                System.out.println(Thread.currentThread().getName() + " changed element "
                        + atomicCounter.getAndIncrement());
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
