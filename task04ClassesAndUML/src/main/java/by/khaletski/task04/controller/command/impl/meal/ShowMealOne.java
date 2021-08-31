package by.khaletski.task04.controller.command.impl.meal;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowMealOne implements Command {

    @Override
    public final TourList execute(final String request) {
        return ServiceFactory.getInstance().getShowMealsServiceImpl().showMeals(Meals.ONE);
    }
}
