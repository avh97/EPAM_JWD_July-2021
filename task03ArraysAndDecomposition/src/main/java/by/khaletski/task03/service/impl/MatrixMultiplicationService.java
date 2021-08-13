package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public class MatrixMultiplicationService implements by.khaletski.task03.service.MatrixMultiplicationService {

    @Override
    public Matrix multiply(Matrix p, Matrix q) throws MatrixException {
        if (p.getHorizontalSize() != q.getVerticalSize()) {
            throw new MatrixException("Incompatible matrices");
        }
        Matrix result = new Matrix(p.getVerticalSize(), q.getHorizontalSize());
        for (int i = 0; i < p.getVerticalSize(); i++) {
            for (int j = 0; j < q.getHorizontalSize(); j++) {
                int value = 0;
                for (int k = 0; k < p.getHorizontalSize(); k++) {
                    value += p.getElement(i, k) * q.getElement(k, j);
                }
                result.setElement(i, j, value);
            }
        }
        return result;
    }
}
