package by.khaletski.task04.controller.command.impl;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class WrongRequest implements Command {

    static final Logger LOGGER = LogManager.getLogger(WrongRequest.class);

    @Override
    public TourList execute(final String request) {
        LOGGER.error("Invalid input!");
        System.out.println("---");
        return new TourList();
    }
}

