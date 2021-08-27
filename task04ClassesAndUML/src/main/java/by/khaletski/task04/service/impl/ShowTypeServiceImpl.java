package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.ShowTypeService;

import java.util.ArrayList;
import java.util.List;

public class ShowTypeServiceImpl implements ShowTypeService {

    @Override
    public final TourList showType(TourList tourList, Type type) {
        List<Tour> tourArrayList = new ArrayList<>();
        for (int i = 0; i < tourList.getSize(); i++) {
            if (tourList.getTours().get(i).getType().equals(type)) {
                tourArrayList.add(tourList.getTours().get(i));
            }
        }
        return new TourList(tourArrayList);
    }

    @Override
    public final TourList showType(Type type) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showType(tourList, type);
    }
}
