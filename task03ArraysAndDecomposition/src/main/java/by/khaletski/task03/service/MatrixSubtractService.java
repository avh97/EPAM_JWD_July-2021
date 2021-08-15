package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public interface MatrixSubtractService {
    Matrix subtract(Matrix p, Matrix q) throws MatrixException;
}
