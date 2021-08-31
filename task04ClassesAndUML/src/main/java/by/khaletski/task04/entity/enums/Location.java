package by.khaletski.task04.entity.enums;

public enum Location {
    GREECE("Greece"),
    RUSSIA("Russia"),
    UKRAINE("Ukraine"),
    TURKEY("Turkey");



    private final String value;

    Location(final String newValue) {
        value = newValue;
    }

    @Override public String toString() {
        return value;
    }
}
