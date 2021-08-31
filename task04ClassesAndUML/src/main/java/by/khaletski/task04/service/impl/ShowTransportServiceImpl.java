package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.service.ShowTransportService;

import java.util.stream.Collectors;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShowTransportServiceImpl implements ShowTransportService {

    /**
     * This method gets all tours with a given transport.
     * @param tourList
     * @param transport
     * @return tours with a given transport
     */

    @Override
    public final TourList showTransport(final TourList tourList, final Transport transport) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getTransport() == transport)
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showTransport(final Transport transport) {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return showTransport(tourList, transport);
    }
}
