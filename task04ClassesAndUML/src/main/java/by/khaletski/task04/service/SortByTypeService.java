package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;

public interface SortByTypeService {
    TourList sortByType(TourList tourList);

    TourList sortByType();
}
