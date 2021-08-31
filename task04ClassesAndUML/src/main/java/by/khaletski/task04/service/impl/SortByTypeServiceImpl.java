package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.SortByTypeService;

import java.util.Comparator;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class SortByTypeServiceImpl implements SortByTypeService {

    /**
     * This method sorts tours by type.
     * @param tourList
     * @return sorted tour list by type
     */

    @Override
    public final TourList sortByType(TourList tourList) {
        tourList.getTours().sort(Comparator.comparing(Tour::getType));
        return tourList;
    }

    @Override
    public final TourList sortByType() {
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        return sortByType(tourList);
    }
}
