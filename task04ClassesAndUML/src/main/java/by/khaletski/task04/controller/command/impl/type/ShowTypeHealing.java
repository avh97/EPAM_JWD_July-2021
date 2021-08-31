package by.khaletski.task04.controller.command.impl.type;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowTypeHealing implements Command {

    @Override
    public final TourList execute(final String request) {
        return ServiceFactory.getInstance().getShowTypeServiceImpl().showType(Type.HEALING);
    }
}
