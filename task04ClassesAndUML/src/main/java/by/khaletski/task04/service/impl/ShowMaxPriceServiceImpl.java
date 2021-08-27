package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.ShowMaxPriceService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShowMaxPriceServiceImpl implements ShowMaxPriceService {

    @Override
    public final TourList showMaxPrice(TourList tourList, int maxPrice) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getPrice() == maxPrice)
                .sorted(Comparator.comparing(Tour::getType))
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showMaxPrice(int maxPrice) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showMaxPrice(tourList, maxPrice);
    }
}
