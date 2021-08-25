package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByPriceService;

import java.util.Comparator;

public class SortByPriceServiceImpl implements SortByPriceService {

    @Override
    public final TourList sortByPrice(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getPrice));
        return tourList;
    }

    @Override
    public final TourList sortByPrice() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return sortByPrice(tourList);
    }
}
