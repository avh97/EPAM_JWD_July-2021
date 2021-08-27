package by.khaletski.task04.dao;

import by.khaletski.task04.entity.Tour;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.entity.enums.Type;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TourListFill {

    //TODO optimize filling algorithm!

    public final TourList fill() {
        TourList tourList = new TourList();
        List<Tour> tours = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("tours.txt"))) {
            while (scanner.hasNextLine()) {
                Tour tour = new Tour();
                String string = scanner.nextLine();
                String[] strings = string.split(", ");
                tour.setType(Type.valueOf(strings[0]));
                tour.setLocation(Location.valueOf(strings[1]));
                tour.setMeals(Meals.valueOf(strings[2]));
                tour.setTransport(Transport.valueOf(strings[3]));
                tour.setPeriod(Integer.parseInt(strings[4]));
                tour.setPrice(Integer.parseInt(strings[5]));
                tours.add(tour);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        tourList.setTours(tours);
        return tourList;
    }
}
