package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.service.exception.MatrixServiceException;

public interface IMatrixTransposeService {
    Matrix transpose(Matrix p);

    Matrix transpose() throws MatrixServiceException;
}
