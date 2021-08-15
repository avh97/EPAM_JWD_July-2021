package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.Command;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.service.factory.ServiceFactory;

public class MatrixAdd implements Command {

    @Override
    public String execute(String request) throws MatrixException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Matrix p = new Matrix(4, 4);
        Matrix q = new Matrix(4, 4);
        serviceFactory.getMatrixFillService().fillRandomized(p,1,10);
        serviceFactory.getMatrixFillService().fillRandomized(q,1,10);
        return "Result: " + serviceFactory.getMatrixAddService().add(p, q);
    }
}
