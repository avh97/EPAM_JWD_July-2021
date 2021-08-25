package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;

public interface SortByLocationService {
    TourList sortByLocation(TourList tourList);

    TourList sortByLocation();
}
