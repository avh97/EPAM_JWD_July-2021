package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class MatrixReentrantLockServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value, int threads) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Thread threadArray[] = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            threadArray[i] = new Thread(new MyThread(matrix, value, reentrantLock), "Thread " + i);
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

        public MyThread(Matrix matrix, int value, ReentrantLock reentrantLock) {
            this.matrix = matrix;
            this.value = value;
            this.reentrantLock = reentrantLock;
        }

        @Override
        public void run() {
            System.out.println("Start " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " is running");
            for (int i = 0; i < matrix.getHorizontalSize(); ++i) {
                try {
                    reentrantLock.lock();
                    if (matrix.getElement(i, i) != value) {
                        matrix.setElement(i, i, value);
                    }
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (MatrixException | InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    reentrantLock.unlock();
                }
            }
            System.out.println(Thread.currentThread().getName() + " stopped");
        }
    }
}
