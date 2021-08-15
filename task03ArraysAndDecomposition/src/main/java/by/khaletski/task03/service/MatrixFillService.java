package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public interface MatrixFillService {
    void fillRandomized(Matrix matrix, int minValue, int maxValue) throws MatrixException;
}
