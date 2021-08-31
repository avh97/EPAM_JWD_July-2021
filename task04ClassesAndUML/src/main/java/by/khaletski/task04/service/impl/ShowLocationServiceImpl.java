package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.service.ShowLocationService;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ShowLocationServiceImpl implements ShowLocationService {

    @Override
    public final TourList showLocation(final TourList tourList, final Location location) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getLocation() == location)
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showLocation(final Location location) {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return showLocation(tourList, location);
    }
}
