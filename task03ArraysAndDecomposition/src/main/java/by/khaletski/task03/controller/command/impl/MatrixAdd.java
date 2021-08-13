package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.Command;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.service.MatrixFillerService;
import by.khaletski.task03.service.factory.ServiceFactory;
import by.khaletski.task03.service.impl.MatrixAdditionService;
import by.khaletski.task03.service.impl.MatrixFillService;

public class MatrixAdd implements Command {

    @Override
    public String execute(String request) throws MatrixException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Matrix p = new Matrix(4, 4);
        Matrix q = new Matrix(4, 4);
        MatrixFillerService matrixFillerService = new MatrixFillService();
        matrixFillerService.fillRandomized(p,1,10);
        matrixFillerService.fillRandomized(q,1,10);
        MatrixAdditionService matrixAdditionService = ServiceFactory.getInstance().getMatrixAdditionService();
        return "Result: " + matrixAdditionService.add(p, q);
    }
}
