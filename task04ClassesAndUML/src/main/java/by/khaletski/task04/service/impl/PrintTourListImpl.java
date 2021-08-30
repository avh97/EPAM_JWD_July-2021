package by.khaletski.task04.service.impl;

import by.khaletski.task04.entity.TourList;

public class PrintTourListImpl implements by.khaletski.task04.service.PrintTourList {

    @Override
    public void printTourList(TourList tourList) {
        try {
            for (int i = 0; i < tourList.getSize(); i++) {
                System.out.println(tourList.getTours().get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("Wrong input!");
        }
    }
}
