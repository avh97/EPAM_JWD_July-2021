package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.service.exception.MatrixServiceException;

public interface IMatrixSubtractService {
    Matrix subtract(Matrix p, Matrix q) throws MatrixServiceException;

    Matrix subtract() throws MatrixServiceException;
}
