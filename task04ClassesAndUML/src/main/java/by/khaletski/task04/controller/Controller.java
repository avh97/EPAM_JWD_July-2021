package by.khaletski.task04.controller;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    static final Logger LOGGER = LogManager.getLogger(Controller.class);

    public final TourList executeTask(final String request) {
        Command executionCommand = provider.getCommand(request);
        LOGGER.debug("Command has been executed.");
        return executionCommand.execute(request);
    }
}
