package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.service.ShowTransportService;

import java.util.ArrayList;
import java.util.List;

public class ShowTransportServiceImpl implements ShowTransportService {

    @Override
    public final TourList showTransport(TourList tourList, Transport transport) {
        List<Tour> tourArrayList = new ArrayList<>();
        for (int i = 0; i < tourList.getSize(); i++) {
            if (tourList.getTours().get(i).getTransport().equals(transport)) {
                tourArrayList.add(tourList.getTours().get(i));
            }
        }
        return new TourList(tourArrayList);
    }

    @Override
    public final TourList showTransport(Transport transport) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showTransport(tourList, transport);
    }
}
