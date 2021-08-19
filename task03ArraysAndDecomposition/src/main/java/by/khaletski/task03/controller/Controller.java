package by.khaletski.task03.controller;

import by.khaletski.task03.controller.command.ICommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    static final Logger LOGGER = LogManager.getLogger(Controller.class);

    public final String executeTask(final String request) {
        ICommand executionCommand = provider.getCommand(request);
        LOGGER.debug("Command has been executed.");
        return executionCommand.execute(request);
    }
}
