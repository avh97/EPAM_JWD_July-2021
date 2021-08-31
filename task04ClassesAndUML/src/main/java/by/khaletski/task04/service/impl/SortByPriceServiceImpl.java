package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByPriceService;

import java.util.Comparator;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class SortByPriceServiceImpl implements SortByPriceService {

    /**
     * This method sorts tours by price.
     * @param tourList
     * @return sorted tour list by price
     */

    @Override
    public final TourList sortByPrice(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getPrice));
        return tourList;
    }

    @Override
    public final TourList sortByPrice() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByPrice(tourList);
    }
}
