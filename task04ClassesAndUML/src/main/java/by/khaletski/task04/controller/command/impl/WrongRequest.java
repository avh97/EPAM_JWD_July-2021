package by.khaletski.task04.controller.command.impl;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;

public final class WrongRequest implements Command {

    @Override
    public final TourList execute(final String request) {
        return new TourList();
    }
}

