package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;

public interface ShowMealsService {
    TourList showMeals(TourList tourList, Meals meals);

    TourList showMeals(Meals meals);
}
