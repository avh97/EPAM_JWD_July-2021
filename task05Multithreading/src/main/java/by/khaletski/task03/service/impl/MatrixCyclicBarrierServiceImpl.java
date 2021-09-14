package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class MatrixCyclicBarrierServiceImpl {
    public Matrix setMainDiagonal(Matrix matrix, int value, int threads) {
        AtomicInteger counter = new AtomicInteger(0);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threads, new MatrixBarrierAction(matrix));
        Thread threadArray[] = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            threadArray[i] = new Thread(new Worker(matrix, cyclicBarrier, value, counter), "Thread " + i);
        }
        for (int i = 0; i < threads; i++) {
            threadArray[i].start();
        }
        return matrix;
    }

    class Worker implements Runnable {
        private CyclicBarrier cyclicBarrier;
        private Matrix matrix;
        private int value;
        AtomicInteger counter;

        Worker(Matrix matrix, CyclicBarrier cyclicBarrier, int value, AtomicInteger counter) {
            this.matrix = matrix;
            this.cyclicBarrier = cyclicBarrier;
            this.value = value;
            this.counter = counter;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");
            while (counter.get() < matrix.getHorizontalSize()) {
                try {
                    matrix.setElement(counter.get(), counter.get(), value);
                    TimeUnit.SECONDS.sleep(1);
                } catch (MatrixException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " +  counter.getAndIncrement());
            }
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    class MatrixBarrierAction implements Runnable {
        private Matrix matrix;

        MatrixBarrierAction(Matrix matrix) {
            this.matrix = matrix;
        }

        @Override
        public void run() {
            System.out.println("Barrier is breached");
        }
    }
}