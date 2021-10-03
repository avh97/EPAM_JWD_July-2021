package by.khaletski.task07.entity;

import by.khaletski.task07.service.Component;

public class Symbol implements Component {
    private static Type type = Type.SYMBOL;
    private char character;

    public Symbol(char character) {
        this.character = character;
    }

    @Override
    public String collect() {
        return String.valueOf(character);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "" + character;
    }
}
