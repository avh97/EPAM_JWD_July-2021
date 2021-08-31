package by.training.demothreads.ex01helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.info("Program started.");
        HelloWorldThread thread = new HelloWorldThread();
        thread.setName("Hello World Thread");
        thread.start();
        LOGGER.info("Program executed.");

        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();
        HelloWorldThread thread2 = new HelloWorldThread();
        thread2.start();
        System.out.println("state: " + thread1.getState());
        System.out.println("state: " + thread2.getState());
    }
}
