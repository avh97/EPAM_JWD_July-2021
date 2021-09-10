package by.khaletski.task03.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Matrix {
    private int[][] matrix;

    static final Logger LOGGER = LogManager.getLogger(Matrix.class);

    public Matrix(final int[][] newA) {
        matrix = newA;
    }

    public Matrix(int lines, int columns) {
        matrix = new int[lines][columns];
    }

    public final int getVerticalSize() {
        return matrix.length;
    }

    public final int getHorizontalSize() {
        return matrix[0].length;
    }

    public final int getElement(final int i, final int j) {
        return matrix[i][j];
    }

    public final void setElement(final int i, final int j, final int value) {
        matrix[i][j] = value;
    }

    @Override
    public final String toString() {
        final String blank = " ";
        StringBuilder s = new StringBuilder("Matrix: " + matrix.length + "x"
                + matrix[0].length + "\n");
        for (int[] row : matrix) {
            for (int value : row) {
                s.append(value).append(blank);
            }
            s.append("\n");
        }
        return s.toString();
    }
}
