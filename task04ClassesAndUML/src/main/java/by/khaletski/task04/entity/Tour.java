package by.khaletski.task04.entity;

import by.khaletski.task04.entity.enums.Location;
import by.khaletski.task04.entity.enums.Meals;
import by.khaletski.task04.entity.enums.Transport;
import by.khaletski.task04.entity.enums.Type;

import java.util.Objects;

public class Tour {
    private Type type;
    private Location location;
    private Meals meals;
    private Transport transport;
    private int period;
    private int price;

    public Tour() {

    }

    public Tour(final Type newType, final Location newLocation, final Meals newMeals, final Transport newTransport,
                final int newPeriod, final int newPrice) {
        type = newType;
        location = newLocation;
        meals = newMeals;
        transport = newTransport;
        period = newPeriod;
        price = newPrice;
    }

    public final Type getType() {
        return type;
    }

    public final void setType(final Type newType) {
        type = newType;
    }

    public final Location getLocation() {
        return location;
    }

    public final void setLocation(final Location newLocation) {
        location = newLocation;
    }

    public final Meals getMeals() {
        return meals;
    }

    public final void setMeals(final Meals newMeals) {
        meals = newMeals;
    }

    public final Transport getTransport() {
        return transport;
    }

    public final void setTransport(final Transport newTransport) {
        transport = newTransport;
    }

    public final int getPeriod() {
        return period;
    }

    public final void setPeriod(final int newPeriod) {
        period = newPeriod;
    }

    public final int getPrice() {
        return price;
    }

    public final void setPrice(final int newPrice) {
        price = newPrice;
    }

    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tour tour = (Tour) o;
        return getPeriod() == tour.getPeriod()
                && getPrice() == tour.getPrice()
                && getType() == tour.getType()
                && getLocation() == tour.getLocation()
                && getMeals() == tour.getMeals()
                && getTransport() == tour.getTransport();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getType(), getLocation(), getMeals(), getTransport(), getPeriod(), getPrice());
    }

    @Override
    public final String toString() {
        return "Tour: type - " + type + ", "
                + "location - " + location + ", "
                + "meals - " + meals + ", "
                + "transport - " + transport + ", "
                + "price - " + price + " USD" + ", "
                + "period - " + period + " days";
    }
}
