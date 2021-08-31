package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.ShowMaxPriceService;

import java.util.stream.Collectors;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShowMaxPriceServiceImpl implements ShowMaxPriceService {

    /**
     * This method gets all tours with price below a given value.
     * @param tourList
     * @param maxPrice
     * @return tour list with price below a given value
     */

    @Override
    public final TourList showMaxPrice(final TourList tourList, final int maxPrice) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getPrice() <= maxPrice)
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showMaxPrice(final int maxPrice) {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return showMaxPrice(tourList, maxPrice);
    }
}
