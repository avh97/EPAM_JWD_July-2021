package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.ShowMinPeriodService;

import java.util.stream.Collectors;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShowMinPeriodServiceImpl implements ShowMinPeriodService {

    /**
     * This method get tours with a given period.
     * @param tourList
     * @param minPeriod
     * @return tour list with a given period
     */

    @Override
    public final TourList showMinPeriod(final TourList tourList, final int minPeriod) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getPeriod() >= minPeriod)
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showMinPeriod(final int minPeriod) {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return showMinPeriod(tourList, minPeriod);
    }
}
