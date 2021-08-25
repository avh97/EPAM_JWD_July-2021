package by.khaletski.task04.entity.enums;

public enum Transport {
    AIRPLANE("airplane"),
    BUS("bus"),
    TRAIN("train");

    private final String string;

    private Transport(String string) {
        this.string = string;
    }

    @Override public String toString() {
        return string;
    }
}
