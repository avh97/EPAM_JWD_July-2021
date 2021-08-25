package by.khaletski.task04.entity;

import by.khaletski.task04.entity.enums.*;

import java.util.Objects;

public class Tour {
    private Type type;
    private Location location;
    private Hotel hotel;
    private Meals meals;
    private Transport transport;
    private int period;
    private int price;

    public Tour() {

    }

    public Tour(Type type, Location location, Hotel hotel, Meals meals, Transport transport, int period, int price) {
        this.type = type;
        this.location = location;
        this.hotel = hotel;
        this.meals = meals;
        this.transport = transport;
        this.period = period;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Meals getMeals() {
        return meals;
    }

    public void setMeals(Meals meals) {
        this.meals = meals;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return getPeriod() == tour.getPeriod()
                && getPrice() == tour.getPrice()
                && getType() == tour.getType()
                && getLocation() == tour.getLocation()
                && getHotel() == tour.getHotel()
                && getMeals() == tour.getMeals()
                && getTransport() == tour.getTransport();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getLocation(), getHotel(), getMeals(), getTransport(), getPeriod(), getPrice());
    }

    @Override
    public String toString() {
        return "Tour: type - " + type + ", "
                + "location - " + location + ", "
                + "hotel - " + hotel + ", "
                + "meals - " + meals + ", "
                + "transport - " + transport + ", "
                + "price - " + price + " USD" + ", "
                + "period - " + period + " days";
    }
}
