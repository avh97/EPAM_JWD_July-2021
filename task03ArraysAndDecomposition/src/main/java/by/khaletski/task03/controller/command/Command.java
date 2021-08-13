package by.khaletski.task03.controller.command;

import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.entity.exception.NumberArrayException;

public interface Command {
    public String execute(String request) throws MatrixException, NumberArrayException;
}
