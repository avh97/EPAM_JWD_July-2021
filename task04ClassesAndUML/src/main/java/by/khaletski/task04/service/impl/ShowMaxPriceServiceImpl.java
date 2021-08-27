package by.khaletski.task04.service.impl;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.service.ShowMaxPriceService;

import java.util.ArrayList;
import java.util.List;

public class ShowMaxPriceServiceImpl implements ShowMaxPriceService {

    @Override
    public final TourList showMaxPrice(TourList tourList, int maxPrice) {
        List<Tour> tourArrayList = new ArrayList<>();
        for (int i = 0; i < tourList.getSize(); i++) {
            if (tourList.getTours().get(i).getPrice() <= maxPrice) {
                tourArrayList.add(tourList.getTours().get(i));
            }
        }
        return new TourList(tourArrayList);
    }

    @Override
    public final TourList showMaxPrice(int maxPrice) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TourList tourList = daoFactory.getTourListFill().fill();
        return showMaxPrice(tourList, maxPrice);
    }
}
