package by.khaletski.task03.entity;

import by.khaletski.task03.exception.MatrixException;

public class Matrix {
    private int[][] elements;

    public Matrix(int[][] elements) {
        this.elements = elements;
    }

    public Matrix(int numberOfColumns, int numberOfRows) throws MatrixException {
        if (numberOfColumns < 1 || numberOfRows < 1) {
            throw new MatrixException();
        } else {
            elements = new int[numberOfColumns][numberOfRows];
        }
    }

    public int getVerticalSize() {
        return elements.length;
    }

    public int getHorizontalSize() {
        return elements[0].length;
    }

    public int getElement(int columnPosition, int rowPosition) throws MatrixException {
        if (checkRange(columnPosition, rowPosition)) {
            return elements[columnPosition][rowPosition];
        } else {
            throw new MatrixException();
        }
    }

    public void setElement(int columnPosition, int rowPosition, int value) throws MatrixException {
        if (checkRange(columnPosition, rowPosition)) {
            elements[columnPosition][rowPosition] = value;
        } else {
            throw new MatrixException();
        }
    }

    private boolean checkRange(int columnPosition, int rowPosition) {
        return (columnPosition >= 0 && columnPosition < elements.length
                && rowPosition >= 0 && rowPosition < elements[0].length);
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nMatrix : " + elements.length + "x"
                + elements[0].length + "\n");
        for (int[] row : elements) {
            for (int value : row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }
        return s.toString();
    }
}
