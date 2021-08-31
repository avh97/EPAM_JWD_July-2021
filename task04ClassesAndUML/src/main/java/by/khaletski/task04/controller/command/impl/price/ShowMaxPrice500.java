package by.khaletski.task04.controller.command.impl.price;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowMaxPrice500 implements Command {

    @Override
    public final TourList execute(final String request) {
        return ServiceFactory.getInstance().getShowMaxPriceServiceImpl().showMaxPrice(500);
    }
}
