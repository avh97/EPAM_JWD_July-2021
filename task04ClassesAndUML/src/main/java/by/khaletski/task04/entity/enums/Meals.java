package by.khaletski.task04.entity.enums;

public enum Meals {
    NONE("none"),
    ONE("one"),
    TWO("two"),
    THREE("three");


    private final String string;

    private Meals(String string) {
        this.string = string;
    }

    @Override public String toString() {
        return string;
    }
}
