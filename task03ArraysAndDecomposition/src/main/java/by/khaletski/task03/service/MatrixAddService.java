package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public interface MatrixAddService {
    Matrix add(Matrix p, Matrix q) throws MatrixException;
}
