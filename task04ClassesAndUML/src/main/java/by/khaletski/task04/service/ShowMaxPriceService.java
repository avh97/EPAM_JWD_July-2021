package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;

public interface ShowMaxPriceService {
    TourList showMaxPrice(TourList tourList, int maxPrice);

    TourList showMaxPrice(int maxPrice);
}
