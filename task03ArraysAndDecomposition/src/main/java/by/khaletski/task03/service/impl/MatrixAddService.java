package by.khaletski.task03.service.impl;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.dao.factory.DAOFactory;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.service.IMatrixAddService;
import by.khaletski.task03.service.exception.MatrixServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'MatrixAddService' objects.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class MatrixAddService implements IMatrixAddService {

    static final Logger LOGGER = LogManager.getLogger(MatrixAddService.class);

    @Override
    public final Matrix add(final Matrix p, final Matrix q) throws MatrixServiceException {
        if (p.getVerticalSize() != q.getVerticalSize()) {
            throw new MatrixServiceException("Incompatible matrices");
        }
        Matrix result = null;
        try {
            result = new Matrix(p.getHorizontalSize(), p.getVerticalSize());
            for (int i = 0; i < p.getHorizontalSize(); i++) {
                for (int j = 0; j < p.getVerticalSize(); j++) {
                    result.setElement(i, j, (p.getElement(i, j) + q.getElement(i, j)));
                }
            }
        } catch (MatrixException e) {
            LOGGER.error("Cannot create matrix.");
            e.printStackTrace();
        }
        return result;
    }

    public final Matrix add() throws MatrixServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        Matrix p;
        Matrix q;
        Matrix result = null;
        try {
            q = daoFactory.getMatricesFill().fill()[0];
            p = daoFactory.getMatricesFill().fill()[1];
            result = add(p, q);
        } catch (DAOException e) {
            LOGGER.error("Cannot access data.");
            e.printStackTrace();
        }
        return result;
    }
}
