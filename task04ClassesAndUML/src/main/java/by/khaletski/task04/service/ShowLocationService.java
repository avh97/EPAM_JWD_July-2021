package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;

public interface ShowLocationService {
    TourList showLocation(TourList tourList, Location location);

    TourList showLocation(Location location);
}
