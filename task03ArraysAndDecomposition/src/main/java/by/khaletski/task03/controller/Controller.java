package by.khaletski.task03.controller;

import by.khaletski.task03.controller.command.Command;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.entity.exception.NumberArrayException;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String request) throws MatrixException, NumberArrayException {
        String commandName;
        Command executionCommand;
        executionCommand = provider.getCommand(request);
        String response;
        response = executionCommand.execute(request);
        return response;
    }
}
