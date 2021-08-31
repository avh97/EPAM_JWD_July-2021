package by.khaletski.task04.service.impl;

import by.khaletski.task04.entity.TourList;

/**
 * @author Anton Khaletski
 * @version 1.0
 */

public class PrintTourListImpl implements by.khaletski.task04.service.PrintTourList {

    /**
     * This method prints contents of a given tour list.
     * @param tourList
     */

    @Override
    public final void printTourList(final TourList tourList) {
        try {
            for (int i = 0; i < tourList.getSize(); i++) {
                System.out.println(tourList.getTours().get(i));
            }
        } catch (NullPointerException e) {
            System.out.println("Wrong input!");
        }
    }
}
