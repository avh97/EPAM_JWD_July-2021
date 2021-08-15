package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.Command;

public class WrongRequest implements Command {

    @Override
    public String execute(String request) {
        return "Wrong input!";
    }
}
