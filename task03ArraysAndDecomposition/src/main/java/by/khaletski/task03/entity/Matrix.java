package by.khaletski.task03.entity;

import by.khaletski.task03.entity.exception.MatrixException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    static final Logger LOGGER = LogManager.getLogger(Matrix.class);

    public Matrix(final int[][] matrix) {
        this.matrix = matrix;
        LOGGER.debug("Matrix has been successfully created");
    }

    public Matrix(final int n, final int m) throws MatrixException {
        if (n < 1 || m < 1) {
            LOGGER.error("Matrix has not been successfully created");
            throw new MatrixException();
        }
        matrix = new int[n][m];
        LOGGER.debug("Matrix has been successfully created");
    }

    public final int getVerticalSize() {
        return matrix.length;
    }

    public final int getHorizontalSize() {
        return matrix[0].length;
    }

    public final int getElement(final int i, final int j) throws MatrixException {
        if (checkRange(i, j)) {
            return matrix[i][j];
        } else {
            throw new MatrixException();
        }
    }

    public final int[][] getElements() {
        return matrix;
    }

    public final void setElement(final int i, final int j, final int value) throws MatrixException {
        if (checkRange(i, j)) {
            matrix[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }

    @Override
    public final String toString() {
        final String blank = " ";
        StringBuilder s = new StringBuilder("\nMatrix: " + matrix.length + "x"
                + matrix[0].length + "\n");
        for (int[] row : matrix) {
            for (int value : row) {
                s.append(value).append(blank);
            }
            s.append("\n");
        }
        return s.toString();
    }

    private boolean checkRange(final int i, final int j) {
        return (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.equals(this.matrix, matrix.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }
}
