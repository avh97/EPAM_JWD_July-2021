package by.khaletski.task04.entity.enums;

public enum Location {
    CROATIA("Croatia"),
    GREECE("Greece"),
    LITHUANIA("Lithuania"),
    RUSSIA("Russia"),
    UKRAINE("Ukraine"),
    TURKEY("Turkey");



    private final String string;

    private Location(String string) {
        this.string = string;
    }

    @Override public String toString() {
        return string;
    }
}
