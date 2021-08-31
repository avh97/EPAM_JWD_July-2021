package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.service.ShowMealsService;

import java.util.stream.Collectors;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShowMealsServiceImpl implements ShowMealsService {

    /**
     * This method gets all tours with a given meal quantity.
     * @param tourList
     * @param meals
     * @return tour list with certain meal quantity
     */

    @Override
    public final TourList showMeals(final TourList tourList, final Meals meals) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getMeals() == meals)
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showMeals(final Meals meals) {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return showMeals(tourList, meals);
    }
}
