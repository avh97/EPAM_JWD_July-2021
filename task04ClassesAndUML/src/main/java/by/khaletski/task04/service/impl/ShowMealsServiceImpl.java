package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.service.ShowMealsService;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ShowMealsServiceImpl implements ShowMealsService {

    @Override
    public final TourList showMeals(TourList tourList, Meals meals) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getMeals() == meals)
                .sorted(Comparator.comparing(Tour::getType))
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showMeals(Meals meals) {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return showMeals(tourList, meals);
    }
}
