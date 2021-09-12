package by.khaletski.task03.demo3;

import java.util.concurrent.Semaphore;

public class Program {

    public static void main(String[] args) {
//задаём количество разрешений на выполнение потока 2
// т.е. одновременно будут выполняться только 2 из всех потоков
        Semaphore sem = new Semaphore(3);
//запускаем 4ёх философов в ресторан
//каждому даём номер i
        for (int i = 1; i < 8; i++)
            new Philosopher(sem, i).start();
    }
}

// класс философа
class Philosopher extends Thread {
    Semaphore sem; // семафор. ограничивающий число философов
    // условный номер философа
    int id;

    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    public void run() {
        try {
//Запрашиваем у семафора разрешение на выполнение
            sem.acquire();
            System.out.println("Философ " + id + " садится за стол");
// философ ест
            sleep(500);

            System.out.println("Философ " + id + " выходит из-за стола");
            sem.release();

// философ гуляет
            sleep(500);
        } catch (InterruptedException e) {
            System.out.println("у философа " + id + " проблемы со здоровьем");
        }
    }
}
