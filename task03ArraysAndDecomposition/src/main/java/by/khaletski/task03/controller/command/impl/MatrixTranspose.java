package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.Command;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.service.MatrixFillerService;
import by.khaletski.task03.service.factory.ServiceFactory;
import by.khaletski.task03.service.impl.MatrixFillService;
import by.khaletski.task03.service.impl.MatrixTransposeService;

public class MatrixTranspose implements Command {

    @Override
    public String execute(String request) throws MatrixException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Matrix p = new Matrix(4, 4);
        MatrixFillerService matrixFillerService = new MatrixFillService();
        matrixFillerService.fillRandomized(p,1,10);
        MatrixTransposeService matrixTransposeService = ServiceFactory.getInstance().getMatrixTransposeService();
        return "Result: " + matrixTransposeService.transpose(p);
    }
}
