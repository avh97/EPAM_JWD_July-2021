package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByTypeService;

import java.util.Comparator;

public class SortByTypeServiceImpl implements SortByTypeService {

    @Override
    public final TourList sortByType(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getType));
        return tourList;
    }

    @Override
    public final TourList sortByType() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByType(tourList);
    }
}
