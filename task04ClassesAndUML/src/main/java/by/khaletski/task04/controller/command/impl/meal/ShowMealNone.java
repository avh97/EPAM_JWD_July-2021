package by.khaletski.task04.controller.command.impl.meal;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowMealNone implements Command {

    @Override
    public TourList execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getShowMealsServiceImpl().showMeals(Meals.NONE);
    }
}
