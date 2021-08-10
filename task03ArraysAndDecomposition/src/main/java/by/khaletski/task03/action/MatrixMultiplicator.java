package by.khaletski.task03.action;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.exception.MatrixException;

public class MatrixMultiplicator {
    public Matrix multiply(Matrix firstMatrix, Matrix secondMatrix) throws MatrixException {
        int verticalSize = firstMatrix.getVerticalSize();
        int horizontalSize = secondMatrix.getHorizontalSize();
        int controlSize = firstMatrix.getHorizontalSize();
        if (controlSize != secondMatrix.getVerticalSize()) {
            throw new MatrixException("Incompatible matrices");
        }
        Matrix result = new Matrix(verticalSize, horizontalSize);
        try {
            for (int columnPosition = 0; columnPosition < verticalSize; columnPosition++) {
                for (int rowPosition = 0; rowPosition < horizontalSize; rowPosition++) {
                    int value = 0;
                    for (int k = 0; k < controlSize; k++) {
                        value += firstMatrix.getElement(columnPosition, k) * secondMatrix.getElement(k, rowPosition);
                    }
                    result.setElement(columnPosition, rowPosition, value);
                }
            }
        } catch (MatrixException e) {
// log: exception impossible
        }
        return result;
    }
}