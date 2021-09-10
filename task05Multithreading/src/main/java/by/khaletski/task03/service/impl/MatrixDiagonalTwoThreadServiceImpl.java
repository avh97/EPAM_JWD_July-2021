package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;

public class MatrixDiagonalTwoThreadServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value) {
        MyThread thread0 = new MyThread(matrix, value, false);
        MyThread thread1 = new MyThread(matrix, value, true);
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
        boolean ifEven;

        public MyThread(Matrix matrix, int value, boolean ifEven) {
            this.matrix = matrix;
            this.value = value;
            this.ifEven = ifEven;
        }

        @Override
        public void run() {
            System.out.println("Start " + Thread.currentThread().getName());
            int startPosition = ifEven ? 0 : 1;
            for (int currentPosition = startPosition; currentPosition < matrix.getHorizontalSize(); currentPosition++) {
                matrix.setElement(currentPosition, currentPosition, value);
            }
        }
    }
}
