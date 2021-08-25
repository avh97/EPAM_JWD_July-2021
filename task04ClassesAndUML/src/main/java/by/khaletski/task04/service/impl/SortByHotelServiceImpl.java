package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByHotelService;

import java.util.Comparator;

public class SortByHotelServiceImpl implements SortByHotelService {

    @Override
    public final TourList sortByHotel(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getHotel));
        return tourList;
    }

    @Override
    public final TourList sortByHotel() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return sortByHotel(tourList);
    }
}
