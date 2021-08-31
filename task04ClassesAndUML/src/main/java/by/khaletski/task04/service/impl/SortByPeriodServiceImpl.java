package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByPeriodService;

import java.util.Comparator;

public class SortByPeriodServiceImpl implements SortByPeriodService {

    @Override
    public final TourList sortByPeriod(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getPeriod));
        return tourList;
    }

    @Override
    public final TourList sortByPeriod() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByPeriod(tourList);
    }
}
