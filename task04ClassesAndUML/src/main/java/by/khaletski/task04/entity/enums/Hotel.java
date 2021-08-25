package by.khaletski.task04.entity.enums;

public enum Hotel {
    NONE("none"),
    STARS_3("3 stars"),
    STARS_4("4 stars"),
    STARS_5("5 stars");


    private final String string;

    private Hotel(String string) {
        this.string = string;
    }

    @Override public String toString() {
        return string;
    }
}
