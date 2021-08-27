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
    public final TourList showLocation(TourList tourList, Location location) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getLocation() == location)
                .sorted(Comparator.comparing(Tour::getType))
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showLocation(Location location) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showLocation(tourList, location);
    }
}
