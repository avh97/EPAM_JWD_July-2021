package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.service.exception.MatrixServiceException;

public interface IMatrixMultiplyService {
    Matrix multiply(Matrix p, Matrix q) throws MatrixServiceException;

    Matrix multiply() throws MatrixServiceException;
}
