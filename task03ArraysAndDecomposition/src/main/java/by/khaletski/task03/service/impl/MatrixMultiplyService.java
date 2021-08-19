package by.khaletski.task03.service.impl;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.dao.factory.DAOFactory;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.service.IMatrixMultiplyService;
import by.khaletski.task03.service.exception.MatrixServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'MatrixMultiplyService' objects.
 *
 * @author Anton Khaletski
 * @version 1.0
 */


public class MatrixMultiplyService implements IMatrixMultiplyService {

    static final Logger LOGGER = LogManager.getLogger(MatrixMultiplyService.class);

    @Override
    public final Matrix multiply(final Matrix p, final Matrix q) throws MatrixServiceException {
        if (p.getHorizontalSize() != q.getVerticalSize()) {
            throw new MatrixServiceException("Incompatible matrices");
        }
        Matrix result = null;
        try {
            result = new Matrix(p.getVerticalSize(), q.getHorizontalSize());
            for (int i = 0; i < p.getVerticalSize(); i++) {
                for (int j = 0; j < q.getHorizontalSize(); j++) {
                    int value = 0;
                    for (int k = 0; k < p.getHorizontalSize(); k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
            LOGGER.error("Cannot create matrix.");
            e.printStackTrace();
        }
        return result;
    }

    public final Matrix multiply() throws MatrixServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        Matrix p;
        Matrix q;
        Matrix result = null;
        try {
            q = daoFactory.getMatricesFill().fill()[0];
            p = daoFactory.getMatricesFill().fill()[1];
            result = multiply(p, q);
        } catch (DAOException e) {
            LOGGER.error("Cannot access data.");
            e.printStackTrace();
        }
        return result;
    }
}
