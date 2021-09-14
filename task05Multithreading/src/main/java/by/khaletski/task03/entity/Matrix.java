package by.khaletski.task03.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Matrix {
    private int[][] a;

    static final Logger LOGGER = LogManager.getLogger(Matrix.class);

    public Matrix(final int[][] a) {
        this.a = a;
        LOGGER.debug("Matrix has been successfully created");
    }

    public Matrix(final int n, final int m) throws MatrixException {
        if (n < 1 || m < 1) {
            LOGGER.error("Matrix has not been successfully created");
            throw new MatrixException();
        }
        a = new int[n][m];
        LOGGER.debug("Matrix has been successfully created");
    }

    public final int getVerticalSize() {
        return a.length;
    }

    public final int getHorizontalSize() {
        return a[0].length;
    }

    public final int getElement(final int i, final int j) throws MatrixException {
        if (checkRange(i, j)) {
            return a[i][j];
        } else {
            throw new MatrixException();
        }
    }

    public final void setElement(final int i, final int j, final int value) throws MatrixException {
        if (checkRange(i, j)) {
            a[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }

    @Override
    public final String toString() {
        final String blank = " ";
        StringBuilder s = new StringBuilder("\nMatrix: " + a.length + "x"
                + a[0].length + "\n");
        for (int[] row : a) {
            for (int value : row) {
                s.append(value).append(blank);
            }
            s.append("\n");
        }
        return s.toString();
    }

    private boolean checkRange(final int i, final int j) {
        return (i >= 0 && i < a.length && j >= 0 && j < a[0].length);
    }
}
