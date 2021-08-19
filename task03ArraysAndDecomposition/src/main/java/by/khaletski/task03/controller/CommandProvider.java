package by.khaletski.task03.controller;

import by.khaletski.task03.controller.command.CommandName;
import by.khaletski.task03.controller.command.ICommand;
import by.khaletski.task03.controller.command.impl.BubbleSort;
import by.khaletski.task03.controller.command.impl.InsertionSort;
import by.khaletski.task03.controller.command.impl.MatrixAdd;
import by.khaletski.task03.controller.command.impl.MatrixMultiply;
import by.khaletski.task03.controller.command.impl.MatrixSubtract;
import by.khaletski.task03.controller.command.impl.MatrixTranspose;
import by.khaletski.task03.controller.command.impl.MergeSort;
import by.khaletski.task03.controller.command.impl.SelectionSort;
import by.khaletski.task03.controller.command.impl.CocktailSort;
import by.khaletski.task03.controller.command.impl.ShellSort;
import by.khaletski.task03.controller.command.impl.WrongRequest;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, ICommand> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.MATRICES_ADD, new MatrixAdd());
        repository.put(CommandName.MATRICES_SUBTRACT, new MatrixSubtract());
        repository.put(CommandName.MATRICES_MULTIPLY, new MatrixMultiply());
        repository.put(CommandName.MATRIX_TRANSPOSE, new MatrixTranspose());
        repository.put(CommandName.BUBBLE_SORT, new BubbleSort());
        repository.put(CommandName.COCKTAIL_SORT, new CocktailSort());
        repository.put(CommandName.SELECTION_SORT, new SelectionSort());
        repository.put(CommandName.INSERTION_SORT, new InsertionSort());
        repository.put(CommandName.MERGE_SORT, new MergeSort());
        repository.put(CommandName.SHELL_SORT, new ShellSort());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    final ICommand getCommand(final String name) {
        CommandName commandName;
        ICommand command;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
