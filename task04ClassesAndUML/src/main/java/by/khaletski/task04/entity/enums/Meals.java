package by.khaletski.task04.entity.enums;

public enum Meals {
    NONE("none"),
    ONE("one"),
    THREE("three");


    private final String value;

    Meals(final String newValue) {
        value = newValue;
    }

    @Override
    public String toString() {
        return value;
    }
}
