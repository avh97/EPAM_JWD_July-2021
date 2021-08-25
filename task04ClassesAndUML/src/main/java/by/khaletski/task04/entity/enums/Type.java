package by.khaletski.task04.entity.enums;

public enum Type {
    CRUISE("cruise"),
    EXCURSION("excursion"),
    HEALING("healing"),
    OTHER("other"),
    RECREATION("recreation"),
    SHOPPING("shopping");


    private final String string;

    private Type(String string) {
        this.string = string;
    }

    @Override public String toString() {
        return string;
    }
}
