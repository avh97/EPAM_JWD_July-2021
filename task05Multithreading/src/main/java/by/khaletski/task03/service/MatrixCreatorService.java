package by.khaletski.task03.service;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.exception.MatrixException;

public class MatrixCreatorService {
    public void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        int v = matrix.getVerticalSize();
        int h = matrix.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                    matrix.setElement(i, j, value);
                } catch (MatrixException e) {
// log: exception impossible
                }
            }
        }
    }
// public int[][] createArray(int n, int m, int minValue, int maxValue) { /*code*/ }
// public void createFromFile(Matrix matrix, File f) { /* code */ }
// public void createFromStream(Matrix matrix, Stream stream) { /* code */ }
}