package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public interface MatrixSubtractionService {
    Matrix subtract(Matrix p, Matrix q) throws MatrixException;
}
