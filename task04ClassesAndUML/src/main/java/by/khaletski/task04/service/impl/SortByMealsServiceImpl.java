package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByMealsService;

import java.util.Comparator;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class SortByMealsServiceImpl implements SortByMealsService {

    /**
     * This method sorts tours by quantity of meals per day.
     * @param tourList
     * @return sorted tour list by quantity of meals per day
     */

    @Override
    public final TourList sortByMeals(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getMeals));
        return tourList;
    }

    @Override
    public final TourList sortByMeals() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByMeals(tourList);
    }
}
