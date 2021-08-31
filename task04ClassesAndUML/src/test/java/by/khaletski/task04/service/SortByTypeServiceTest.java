package by.khaletski.task04.service;

import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.factory.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortByTypeServiceTest {

    @Test
    void SortByTypeTest() {
        TourList unsorted = new TourList();
        unsorted.addTour(new Tour(Type.EXCURSION, Location.RUSSIA, Meals.NONE, Transport.TRAIN,
                5, 100 ));
        unsorted.addTour(new Tour(Type.RECREATION, Location.RUSSIA, Meals.ONE, Transport.TRAIN,
                14, 500));
        unsorted.addTour(new Tour(Type.CRUISE, Location.GREECE, Meals.THREE, Transport.AIRPLANE,
                30, 3000));
        unsorted.addTour(new Tour(Type.HEALING, Location.UKRAINE, Meals.THREE, Transport.BUS,
                14, 800));
        unsorted.addTour(new Tour(Type.SHOPPING, Location.UKRAINE, Meals.NONE, Transport.BUS,
                3, 90));
        unsorted.addTour(new Tour(Type.HEALING, Location.TURKEY, Meals.THREE, Transport.AIRPLANE,
                10, 700));
        TourList sorted = new TourList();
        sorted.addTour(new Tour(Type.CRUISE, Location.GREECE, Meals.THREE, Transport.AIRPLANE,
                30, 3000));
        sorted.addTour(new Tour(Type.EXCURSION, Location.RUSSIA, Meals.NONE, Transport.TRAIN,
                5, 100 ));
        sorted.addTour(new Tour(Type.HEALING, Location.UKRAINE, Meals.THREE, Transport.BUS,
                14, 800));
        sorted.addTour(new Tour(Type.HEALING, Location.TURKEY, Meals.THREE, Transport.AIRPLANE,
                10, 700));
        sorted.addTour(new Tour(Type.RECREATION, Location.RUSSIA, Meals.ONE, Transport.TRAIN,
                14, 500));
        sorted.addTour(new Tour(Type.SHOPPING, Location.UKRAINE, Meals.NONE, Transport.BUS,
                3, 90));
        assertEquals(ServiceFactory.getInstance().getSortByTypeServiceImpl().sortByType(unsorted), sorted);
    }
}
