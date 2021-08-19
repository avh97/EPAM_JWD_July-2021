package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.ICommand;

public final class WrongRequest implements ICommand {

    @Override
    public String execute(final String request) {
        return "Wrong input!";
    }
}
