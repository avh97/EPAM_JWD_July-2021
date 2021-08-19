package by.khaletski.task03.controller.command.impl;

import by.khaletski.task03.controller.command.ICommand;
import by.khaletski.task03.service.exception.MatrixServiceException;
import by.khaletski.task03.service.factory.ServiceFactory;

public final class MatrixTranspose implements ICommand {

    @Override
    public String execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        String result = null;
        try {
            result = serviceFactory.getMatrixTransposeService().transpose().toString();
        } catch (MatrixServiceException e) {
            e.printStackTrace();
        }
        return result;
    }
}
