package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.ShowMinPeriodService;

import java.util.ArrayList;
import java.util.List;

public class ShowMinPeriodServiceImpl implements ShowMinPeriodService {

    @Override
    public final TourList showMinPeriod(TourList tourList, int minPeriod) {
        List<Tour> tourArrayList = new ArrayList<>();
        for (int i = 0; i < tourList.getSize(); i++) {
            if (tourList.getTours().get(i).getPeriod() >= minPeriod) {
                tourArrayList.add(tourList.getTours().get(i));
            }
        }
        return new TourList(tourArrayList);
    }

    @Override
    public final TourList showMinPeriod(int minPeriod) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showMinPeriod(tourList, minPeriod);
    }
}
