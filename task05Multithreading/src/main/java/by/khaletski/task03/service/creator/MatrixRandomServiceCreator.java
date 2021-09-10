package by.khaletski.task03.service.creator;

import by.khaletski.task03.entity.Matrix;

public class MatrixRandomServiceCreator {
    public Matrix createRandomized(int size, int minValue, int maxValue) {
        Matrix matrix = new Matrix(new int[size][size]);
        int v = matrix.getVerticalSize();
        int h = matrix.getHorizontalSize();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                matrix.setElement(i, j, value);
            }
        }
        return matrix;
    }
}
