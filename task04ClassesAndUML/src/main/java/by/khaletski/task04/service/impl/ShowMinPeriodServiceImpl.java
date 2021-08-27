package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.service.ShowMinPeriodService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShowMinPeriodServiceImpl implements ShowMinPeriodService {

    @Override
    public final TourList showMinPeriod(TourList tourList, int minPeriod) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getPeriod() == minPeriod)
                .sorted(Comparator.comparing(Tour::getType))
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showMinPeriod(int minPeriod) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showMinPeriod(tourList, minPeriod);
    }
}
