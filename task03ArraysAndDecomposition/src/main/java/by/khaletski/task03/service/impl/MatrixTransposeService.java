package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public class MatrixTransposeService implements by.khaletski.task03.service.MatrixTransposeService {

    @Override
    public Matrix transpose(Matrix p) throws MatrixException {
        Matrix result = new Matrix(p.getHorizontalSize(), p.getVerticalSize());
        for (int i = 0; i < p.getHorizontalSize(); i++) {
            for (int j = 0; j < p.getVerticalSize(); j++) {
                // formula
                result.setElement(i, j, p.getElement(j, i));
            }
        }
        return result;
    }
}
