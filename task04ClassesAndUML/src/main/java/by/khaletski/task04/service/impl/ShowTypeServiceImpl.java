package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.ShowTypeService;

import java.util.stream.Collectors;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShowTypeServiceImpl implements ShowTypeService {

    /**
     * This method get tours with given type.
     * @param tourList
     * @param type
     * @return tour list with given type
     */

    @Override
    public final TourList showType(TourList tourList, Type type) {
        tourList.setTours(tourList.getTours()
                .stream()
                .filter(s -> s.getType() == type)
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
