package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;

public interface SortByPriceService {
    TourList sortByPrice(TourList tourList);

    TourList sortByPrice();
}
