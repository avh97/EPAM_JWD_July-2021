package by.khaletski.task04.view;

import by.khaletski.task04.controller.Controller;
import by.khaletski.task04.controller.command.CommandName;
import by.khaletski.task04.entity.TourList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.info("Program started.");
        Controller controller = new Controller();
        printCommands();
        printResults(controller.executeTask(getTaskName()));
        LOGGER.info("Program executed.");
    }

    public static String getTaskName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printCommands() {
        String[] string = Arrays.toString(CommandName.values()).replaceAll("^.|.$", "").split(", ");
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
    }

    public static void printResults(TourList tourList) {
        for (int i = 0; i < tourList.getSize(); i++) {
            System.out.println(tourList.getTours().get(i));
        }
    }
}
