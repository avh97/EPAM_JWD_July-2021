package by.khaletski.task04.controller.command;

import by.khaletski.task04.entity.TourList;

public interface Command {
    TourList execute(String request);
}
