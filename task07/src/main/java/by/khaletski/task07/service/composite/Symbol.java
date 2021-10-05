package by.khaletski.task07.service.composite;

public class Symbol implements Component {
    private static final int SINGLE_SYMBOL = 1;
    private String stringSymbol;
    private Type type;

    public Symbol(String stringSymbol, Type type) {
        if (stringSymbol.length() == SINGLE_SYMBOL) {
            this.stringSymbol = stringSymbol;
            this.type = type;
        }
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return stringSymbol;
    }
}
