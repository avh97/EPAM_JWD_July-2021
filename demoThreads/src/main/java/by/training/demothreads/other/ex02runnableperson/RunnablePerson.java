package by.training.demothreads.other.ex02runnableperson;

public class RunnablePerson extends Person implements Runnable {

    public RunnablePerson(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": Hello World"); //name of the thread
            System.out.println("Current thread: " + Thread.currentThread()); //get current thread
            System.out.println("Thread priority: " + Thread.currentThread().getPriority()); //get priority or the thread
            System.out.println("State of the thread " + Thread.currentThread().getState()); //get state of the thread
            System.out.println("Is alive: " + Thread.currentThread().isAlive() + "\n"); //determine, if the thread is executing
            // void start() - начинает выполнение потока
            //static void sleep(long msec) - прекращает выполнение потока на указанное количество млсек
            //static void yield() - приостановка потока, чтобы передать ресурсы процессорадругому потоку
            //void join() – ожидание завершения потока
        }
    }

    public static void main(String[] args) {
        RunnablePerson p1 = new RunnablePerson("Alice");
        Thread t1 = new Thread(p1);
        t1.start();
        RunnablePerson p2 = new RunnablePerson("Bob");
        Thread t2 = new Thread(p2);
        t2.start();
    }
}
