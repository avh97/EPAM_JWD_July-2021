package by.khaletski.task07.entity;

public enum Type {
    TEXT("(?<=\n)"),
    PARAGRAPH("(?<=\\.+\\s)(?=[A-Z])"),
    SENTENCE("(?<=[^\\w])(?=\\w)|(?<=\\w)(?=[^\\w])|(?<=[^\\w])(?=[^\\w])"),
    WORD("(?<=\\w)"),
    SYMBOL;

    private static final Type[] values = values();

    private String regexForSplit;

    Type() {

    }

    Type(String regex) {
        this.regexForSplit = regex;
    }

    public Type getChild() {
        if (ordinal() == values.length) {
            return null;
        }
        return values[ordinal() + 1];
    }

    public String getRegexForSplit() {
        return regexForSplit;
    }
}
