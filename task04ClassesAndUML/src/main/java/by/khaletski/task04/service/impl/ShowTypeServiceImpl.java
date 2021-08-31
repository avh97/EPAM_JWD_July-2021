package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.ShowTypeService;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ShowTypeServiceImpl implements ShowTypeService {

    @Override
    public final TourList showType(TourList tourList, Type type) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getType() == type)
                .sorted(Comparator.comparing(Tour::getLocation))
                .collect(Collectors.toList()));
        return tourList;
    }

    @Override
    public final TourList showType(Type type) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showType(tourList, type);
    }
}
