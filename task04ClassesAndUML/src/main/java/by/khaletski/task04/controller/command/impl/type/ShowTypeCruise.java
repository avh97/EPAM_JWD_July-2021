package by.khaletski.task04.controller.command.impl.type;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowTypeCruise implements Command {

    @Override
    public TourList execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getShowTypeServiceImpl().showType(Type.CRUISE);
    }
}
