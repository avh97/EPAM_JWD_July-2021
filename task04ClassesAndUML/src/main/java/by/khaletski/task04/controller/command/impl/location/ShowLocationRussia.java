package by.khaletski.task04.controller.command.impl.location;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowLocationRussia implements Command {

    @Override
    public TourList execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getShowLocationServiceImpl().showLocation(Location.RUSSIA);
    }
}
