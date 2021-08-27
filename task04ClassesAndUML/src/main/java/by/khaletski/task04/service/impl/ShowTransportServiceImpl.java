package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.service.ShowTransportService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShowTransportServiceImpl implements ShowTransportService {

    @Override
    public final TourList showTransport(TourList tourList, Transport transport) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getTransport() == transport)
                .sorted(Comparator.comparing(Tour::getType))
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showTransport(Transport transport) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showTransport(tourList, transport);
    }
}
