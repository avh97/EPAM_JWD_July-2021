package by.khaletski.task03.creator;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.exception.MatrixException;

public class MatrixCreator {
    public void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        int verticalSize = matrix.getVerticalSize();
        int horizontalSize = matrix.getHorizontalSize();
        for (int columnPosition = 0; columnPosition < verticalSize; columnPosition++) {
            for (int rowPosition = 0; rowPosition < horizontalSize; rowPosition++) {
                try {
                    int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                    matrix.setElement(columnPosition, rowPosition, value);
                } catch (MatrixException e) {
// log: exception impossible
                }
            }
        }
    }
// public int[][] createArray(int n, int m, int minValue, int maxValue) {/*code*/
// public void createFromFile(Matrix matrix, File f) { /* code */ }
// public void createFromStream(Matrix matrix, Stream stream) { /* code */ }
}
