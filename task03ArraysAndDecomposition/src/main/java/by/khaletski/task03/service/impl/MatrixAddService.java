package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public class MatrixAddService implements by.khaletski.task03.service.MatrixAddService {

    @Override
    public Matrix add(Matrix p, Matrix q) throws MatrixException {
        if (p.getVerticalSize() != q.getVerticalSize() || q.getVerticalSize() != q.getVerticalSize()) {
            throw new MatrixException("Incompatible matrices");
        }
        Matrix result = new Matrix(p.getHorizontalSize(), p.getVerticalSize());
        for (int i = 0; i < p.getHorizontalSize(); i++) {
            for (int j = 0; j < p.getVerticalSize(); j++) {
                result.setElement(i, j, (p.getElement(i, j) + q.getElement(i, j)));
            }
        }
        return result;
    }
}
