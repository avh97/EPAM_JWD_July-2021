package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public interface MatrixMultiplicationService {
    Matrix multiply(Matrix p, Matrix q) throws MatrixException;
}
