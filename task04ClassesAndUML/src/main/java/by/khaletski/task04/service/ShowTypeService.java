package by.khaletski.task04.service;

import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;

public interface ShowTypeService {
    TourList showType(TourList tourList, Type type);

    TourList showType(Type type);
}
