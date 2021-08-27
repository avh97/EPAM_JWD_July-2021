package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;

public interface ShowMinPeriodService {
    TourList showMinPeriod(TourList tourList, int minPeriod);

    TourList showMinPeriod(int minPeriod);
}
