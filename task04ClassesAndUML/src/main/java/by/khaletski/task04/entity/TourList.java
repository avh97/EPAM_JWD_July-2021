package by.khaletski.task04.entity;

import java.util.List;

public class TourList {
    private List<Tour> tours;

    public TourList() {

    }

    public TourList(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public int getSize() {
        List<Tour> tourList = tours;
        return tourList.size();
    }

    @Override
    public String toString() {
        return "TourList: " + tours;
    }


}
