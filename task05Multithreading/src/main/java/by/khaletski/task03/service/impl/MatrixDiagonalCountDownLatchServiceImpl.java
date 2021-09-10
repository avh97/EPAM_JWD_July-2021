package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixDiagonalCountDownLatchServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value) throws InterruptedException {
        int width = matrix.getHorizontalSize();
        ExecutorService executor = Executors.newFixedThreadPool(width);
        CountDownLatch latch = new CountDownLatch(width);
        for (int i = 0; i < width; i++) {
            int finalI = i;
            executor.execute(() -> {
                matrix.setElement(finalI, finalI, value);
                System.out.println("Place element " + finalI + "-" + finalI + " in thread "
                        + Thread.currentThread().getName());
                latch.countDown();
            });
        }
        latch.await();
        executor.shutdown();
        return matrix;
    }
}
