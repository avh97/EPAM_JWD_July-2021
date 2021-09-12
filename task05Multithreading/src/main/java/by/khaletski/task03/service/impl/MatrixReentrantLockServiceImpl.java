package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;

public class MatrixReentrantLockServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value) {
        MyThread thread0 = new MyThread(matrix, value);
        MyThread thread1 = new MyThread(matrix, value);
        thread0.start();
        thread1.start();
        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return matrix;
    }

    public class MyThread extends Thread {
        Matrix matrix;
        int value;

        public MyThread(Matrix matrix, int value) {
            this.matrix = matrix;
            this.value = value;
        }

        @Override
        public void run() {
            synchronized (matrix) {
                for (int i = 0; i < matrix.getHorizontalSize(); i++) {
                    System.out.println("Start " + Thread.currentThread().getName());
                    matrix.setElement(i, i, value);
                }
            }
        }
    }
}
