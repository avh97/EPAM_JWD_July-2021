package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.service.exception.MatrixServiceException;

public interface IMatrixAddService {
    Matrix add(Matrix p, Matrix q) throws MatrixServiceException;

    Matrix add() throws MatrixServiceException;
}
