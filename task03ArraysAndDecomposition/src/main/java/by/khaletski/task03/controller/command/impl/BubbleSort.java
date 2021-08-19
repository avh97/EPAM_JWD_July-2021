package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.ICommand;
import by.khaletski.task03.service.factory.ServiceFactory;

public final class BubbleSort implements ICommand {

    @Override
    public String execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getBubbleSortService().sort().toString();
    }
}
