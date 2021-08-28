package by.khaletski.task04.view;

import by.khaletski.task04.controller.Controller;
import by.khaletski.task04.controller.command.CommandName;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.info("Program started.");
        startApplication();
        LOGGER.info("Program executed.");
    }

    public static void startApplication() {
        Controller controller = new Controller();
        String string;
        printCommands();
        while (true) {
            string = getTaskName();
            if (string.equals("EXIT")) {
                break;
            }
            printResults(controller.executeTask(string));
        }
    }

    public static String getTaskName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printCommands() {
        String[] string = Arrays.toString(CommandName.values())
                .replaceAll("^.|.$", "")
                .split(", ");
        for (int i = 0; i < string.length - 1; i++) {
            System.out.println(string[i]);
        }
    }

    public static void printResults(TourList tourList) {
        try {
            for (int i = 0; i < tourList.getSize(); i++) {
                System.out.println(tourList.getTours().get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("Wrong input!");
        }

    }
}
