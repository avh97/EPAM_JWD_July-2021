package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByTransportService;

import java.util.Comparator;

public class SortByTransportServiceImpl implements SortByTransportService {

    @Override
    public final TourList sortByTransport(final TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getTransport));
        return tourList;
    }

    @Override
    public final TourList sortByTransport() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByTransport(tourList);
    }
}
