package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByLocationService;

import java.util.Comparator;

public class SortByLocationServiceImpl implements SortByLocationService {

    @Override
    public final TourList sortByLocation(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getLocation));
        return tourList;
    }

    @Override
    public final TourList sortByLocation() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByLocation(tourList);
    }
}
