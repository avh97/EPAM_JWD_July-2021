package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.Command;
import by.khaletski.task03.entity.NumberArray;
import by.khaletski.task03.entity.exception.NumberArrayException;
import by.khaletski.task03.service.factory.ServiceFactory;

public class BubbleSort implements Command {

    @Override
    public String execute(String request) throws NumberArrayException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        NumberArray numberArray = new NumberArray(25);
        serviceFactory.getNumberArrayFillService().fillRandomized(numberArray, 1, 100);
        return "Result: " + serviceFactory.getBubbleSortService().sort(numberArray);
    }
}
