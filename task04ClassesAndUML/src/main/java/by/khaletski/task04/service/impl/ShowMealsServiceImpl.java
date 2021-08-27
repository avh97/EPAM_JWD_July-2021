package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.service.ShowMealsService;

import java.util.ArrayList;
import java.util.List;

public class ShowMealsServiceImpl implements ShowMealsService {

    @Override
    public final TourList showMeals(TourList tourList, Meals meals) {
        List<Tour> tourArrayList = new ArrayList<>();
        for (int i = 0; i < tourList.getSize(); i++) {
            if (tourList.getTours().get(i).getMeals().equals(meals)) {
                tourArrayList.add(tourList.getTours().get(i));
            }
        }
        return new TourList(tourArrayList);
    }

    @Override
    public final TourList showMeals(Meals meals) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showMeals(tourList, meals);
    }
}
