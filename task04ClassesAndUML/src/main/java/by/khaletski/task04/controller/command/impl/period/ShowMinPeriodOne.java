package by.khaletski.task04.controller.command.impl.period;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowMinPeriodOne implements Command {

    @Override
    public TourList execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getShowMinPeriodServiceImpl().showMinPeriod(1);
    }
}
