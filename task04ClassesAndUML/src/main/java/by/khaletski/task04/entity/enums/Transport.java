package by.khaletski.task04.entity.enums;

public enum Transport {
    AIRPLANE("airplane"),
    BUS("bus"),
    TRAIN("train");

    private final String value;

    Transport(final String newValue) {
        value = newValue;
    }

    @Override public String toString() {
        return value;
    }
}
