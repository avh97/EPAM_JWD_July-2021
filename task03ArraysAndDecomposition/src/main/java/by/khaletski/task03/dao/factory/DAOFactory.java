package by.khaletski.task03.dao.factory;

import by.khaletski.task03.dao.INumberArrayFill;
import by.khaletski.task03.dao.impl.MatricesFill;
import by.khaletski.task03.dao.impl.NumberArrayFill;
import by.khaletski.task03.dao.util.MatrixFill;

public final class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();

    private final MatricesFill matricesFill = new MatricesFill();
    private final NumberArrayFill numberArrayFill = new NumberArrayFill();

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return INSTANCE;
    }

    public MatricesFill getMatricesFill() {
        return matricesFill;
    }

    public INumberArrayFill getNumberArrayFill() {
        return numberArrayFill;
    }
}
