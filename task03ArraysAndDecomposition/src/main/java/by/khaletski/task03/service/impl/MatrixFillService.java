package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;

public class MatrixFillService implements by.khaletski.task03.service.MatrixFillService {

    public void fillRandomized(Matrix p, int minValue, int maxValue) throws MatrixException {
        for (int i = 0; i < p.getVerticalSize(); i++) {
            for (int j = 0; j < p.getHorizontalSize(); j++) {
                try {
                    int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                    p.setElement(i, j, value);
                } catch (MatrixException e) {

                }
            }
        }
    }
}
