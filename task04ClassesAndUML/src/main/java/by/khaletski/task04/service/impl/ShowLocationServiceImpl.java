package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.service.ShowLocationService;

import java.util.stream.Collectors;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShowLocationServiceImpl implements ShowLocationService {

    /**
     * This method gets all tours with a particular location.
     * @param tourList
     * @param location
     * @return tour list with particular location
     */

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
