package by.khaletski.task03.controller;

import by.khaletski.task03.controller.command.Command;
import by.khaletski.task03.controller.command.CommandName;
import by.khaletski.task03.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.MATRICES_ADD, new MatrixAdd());
        repository.put(CommandName.MATRICES_SUBTRACT, new MatrixSubtract());
        repository.put(CommandName.MATRICES_MULTIPLY, new MatrixMultiply());
        repository.put(CommandName.MATRIX_TRANSPOSE, new MatrixTranspose());
        repository.put(CommandName.BUBBLE_SORT, new BubbleSort());
        repository.put(CommandName.SHAKER_SORT, new ShakerSort());
        repository.put(CommandName.INSERTION_SORT, new InsertionSort());
        repository.put(CommandName.SELECTION_SORT, new SelectionSort());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            //write log
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
