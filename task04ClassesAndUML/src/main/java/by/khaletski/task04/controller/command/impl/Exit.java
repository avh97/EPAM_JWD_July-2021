package by.khaletski.task04.controller.command.impl;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;

public class Exit implements Command {

    @Override
    public TourList execute(final String request) {
        return new TourList();
    }
}
