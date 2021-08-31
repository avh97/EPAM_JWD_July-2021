package by.khaletski.task04.entity.enums;

public enum Type {
    CRUISE("cruise"),
    EXCURSION("excursion"),
    HEALING("healing"),
    RECREATION("recreation"),
    SHOPPING("shopping");


    private final String value;

    Type(final String newValue) {
        value = newValue;
    }

    @Override public String toString() {
        return value;
    }
}
