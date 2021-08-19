package by.khaletski.task03.dao.impl;

import by.khaletski.task03.dao.IMatricesFill;
import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.dao.util.MatrixFill;
import by.khaletski.task03.entity.Matrix;

public class MatricesFill implements IMatricesFill {

    @Override
    public final Matrix[] fill() throws DAOException {
        Matrix[] matrices = new Matrix[2];
        MatrixFill matrixFill = new MatrixFill();
        matrices[0] = matrixFill.fillFrom("matrix1.txt");
        matrices[1] = matrixFill.fillFrom("matrix2.txt");
        return matrices;
    }
}
