package by.khaletski.task04.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TourList {
    private List<Tour> tours = new ArrayList<>();

    public TourList() {

    }

    public TourList(final List<Tour> newTours) {
        tours = newTours;
    }

    public final List<Tour> getTours() {
        return tours;
    }

    public final void setTours(final List<Tour> newTours) {
        tours = newTours;
    }

    public final void addTour(final Tour tour) {
        tours.add(tour);
    }

    public final Tour getTour(final int index) {
        return tours.get(index);
    }

    public final int getSize() {
        List<Tour> tourList = tours;
        return tourList.size();
    }

    @Override
    public final String toString() {
        return "TourList: " + tours;
    }

    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TourList tourList = (TourList) o;
        return Objects.equals(getTours(), tourList.getTours());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getTours());
    }
}
