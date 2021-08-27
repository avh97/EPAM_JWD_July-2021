package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.service.ShowLocationService;

import java.util.ArrayList;
import java.util.List;

public class ShowLocationServiceImpl implements ShowLocationService {

    @Override
    public final TourList showLocation(TourList tourList, Location location) {
        List<Tour> tourArrayList = new ArrayList<>();
        for (int i = 0; i < tourList.getSize(); i++) {
            if (tourList.getTours().get(i).getLocation().equals(location)) {
                tourArrayList.add(tourList.getTours().get(i));
            }
        }
        return new TourList(tourArrayList);
    }

    @Override
    public final TourList showLocation(Location location) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showLocation(tourList, location);
    }
}
