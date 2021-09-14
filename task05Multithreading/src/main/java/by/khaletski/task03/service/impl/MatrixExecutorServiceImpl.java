package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixExecutorServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < matrix.getHorizontalSize(); i++) {
            executor.execute(new MyThread(matrix, value, i));
        }
        executor.shutdown();
        return matrix;
    }

    public class MyThread implements Runnable {
        Matrix matrix;
        int value;
        int index;

        public MyThread(Matrix matrix, int value, int index) {
            this.matrix = matrix;
            this.value = value;
            this.index = index;
        }

        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName() + " element-" + index);
            try {
                matrix.setElement(index, index, value);
            } catch (MatrixException e) {
                e.printStackTrace();
            }
        }
    }
}
