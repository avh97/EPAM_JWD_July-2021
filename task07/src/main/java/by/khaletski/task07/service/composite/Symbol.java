package by.khaletski.task07.service.composite;

public class Symbol implements Component {
    private static final int SINGLE_SYMBOL = 1;
    private String symbol;
    private Type type;

    public Symbol(String symbol, Type type) {
        if (symbol.length() == SINGLE_SYMBOL) {
            this.symbol = symbol;
            this.type = type;
        }
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
