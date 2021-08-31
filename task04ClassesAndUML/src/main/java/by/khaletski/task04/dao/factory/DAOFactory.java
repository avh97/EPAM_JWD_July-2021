package by.khaletski.task04.dao.factory;

import by.khaletski.task04.dao.TourListFill;

public final class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();

    private final TourListFill tourListFill = new TourListFill();

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return INSTANCE;
    }

    public TourListFill getTourListFill() {
        return tourListFill;
    }
}
