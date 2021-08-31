package by.khaletski.task04.view;

import by.khaletski.task04.controller.Controller;
import by.khaletski.task04.controller.command.Localization;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.debug("Program started.");
        Controller controller = new Controller();
        controller.startApplication(Localization.US);
        LOGGER.debug("Program executed.");
    }
}
