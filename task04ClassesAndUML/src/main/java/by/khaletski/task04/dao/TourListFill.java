package by.khaletski.task04.dao;

import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.entity.enums.Type;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TourListFill {

    public final TourList fill() {
        TourList tourList = new TourList();
        try (Scanner scanner = new Scanner(new File("tours.txt"))) {
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split(", ");
                tourList.addTour(new Tour(
                        Type.valueOf(strings[0]),
                        Location.valueOf(strings[1]),
                        Meals.valueOf(strings[2]),
                        Transport.valueOf(strings[3]),
                        Integer.parseInt(strings[4]),
                        Integer.parseInt(strings[5])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tourList;
    }
}
