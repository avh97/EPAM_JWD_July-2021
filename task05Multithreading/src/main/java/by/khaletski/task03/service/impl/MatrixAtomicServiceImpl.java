package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.atomic.AtomicInteger;

public class MatrixAtomicServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value, int threads) {
        Thread threadArray[] = new Thread[threads];
        AtomicInteger counter = new AtomicInteger(0);
        for (int i = 0; i < threads; i++) {
            threadArray[i] = new Thread(new MyThread(matrix, value, counter), "Thread " + i);
            System.out.println("Thread " + i + " has been created");
        }
        for (int i = 0; i < threads; i++) {
            threadArray[i].start();
        }
        return matrix;
    }

    public class MyThread implements Runnable {
        Matrix matrix;
        int value;
        AtomicInteger counter;

        public MyThread(Matrix matrix, int value, AtomicInteger counter) {
            this.matrix = matrix;
            this.value = value;
            this.counter = counter;
        }

        @Override
        public void run() {
            System.out.println("Start " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " is running");
            while (counter.get() < matrix.getHorizontalSize()) {
                try {
                    matrix.setElement(counter.get(), counter.get(), value);
                } catch (MatrixException e) {
                    e.printStackTrace();
                }
                System.out.println(counter.getAndIncrement());
            }
            System.out.println(Thread.currentThread().getName() + " stopped");
        }
    }
}
