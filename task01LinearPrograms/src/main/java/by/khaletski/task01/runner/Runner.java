package by.khaletski.task01.runner;

import by.khaletski.task01.util.TaskSwitcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    final static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Application launched");
        TaskSwitcher taskSwitcher = new TaskSwitcher();
        taskSwitcher.startApplication();
        logger.info("Application successfully executed");

    }
}
