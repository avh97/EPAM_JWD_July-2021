package by.training.demothreads.diningphilosophers;

import java.util.concurrent.Semaphore;

public class PhilosophersApp {

    /**
     * Задача про обедающих философов. Ее суть: есть несколько философов, но за круглым столом находится
     * только пять тарелок и пять вилок. И надо, чтобы все философы пообедали, но при этом не возникло
     * взаимоблокировки философами друг друга в борьбе за тарелку и вилку (доп. см. классическую формулировку задачи):
     */

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(5);
        for (int i = 1; i <= 13; i++)
            new Philosopher(sem, i).start();
    }
}
