package by.khaletski.task03.service.impl;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.dao.factory.DAOFactory;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.service.IMatrixTransposeService;
import by.khaletski.task03.service.exception.MatrixServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'MatrixTransposeService' objects.
 *
 * @author Anton Khaletski
 * @version 1.0
 */


public class MatrixTransposeService implements IMatrixTransposeService {

    static final Logger LOGGER = LogManager.getLogger(MatrixTransposeService.class);

    @Override
    public final Matrix transpose(final Matrix p) {
        int[][] firstArray = p.getElements();
        int[][] secondArray = new int[p.getHorizontalSize()][p.getVerticalSize()];
        int n = p.getVerticalSize();
        int m = p.getHorizontalSize();
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                secondArray[i][j] = firstArray[j][i];
            }
        }
        return new Matrix(secondArray);
    }

    public final Matrix transpose() throws MatrixServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        Matrix p = null;
        try {
            p = daoFactory.getMatricesFill().fill()[0];
            p = transpose(p);
        } catch (DAOException e) {
            LOGGER.error("Cannot access data.");
            e.printStackTrace();
        }
        return p;
    }
}
