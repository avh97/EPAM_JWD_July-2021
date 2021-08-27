package by.khaletski.task04.controller.command.impl.transport;

import by.khaletski.task04.controller.command.Command;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.service.factory.ServiceFactory;

public class ShowTransportBus implements Command {

    @Override
    public TourList execute(final String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        return serviceFactory.getShowTransportServiceImpl().showTransport(Transport.BUS);
    }
}
