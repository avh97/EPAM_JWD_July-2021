package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;

import java.util.concurrent.Semaphore;

public class MatrixSemaphoreServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value) {
        int threads = 4;
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < threads; i++) {
            MyThread myThread = new MyThread(semaphore, matrix, value);
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

        public MyThread(Semaphore semaphore, Matrix matrix, int value) {
            this.semaphore = semaphore;
            this.matrix = matrix;
            this.value = value;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < matrix.getHorizontalSize(); i++) {
                System.out.println(Thread.currentThread().getName());
                matrix.setElement(i, i, value);
            }
            semaphore.release();
        }
    }
}
