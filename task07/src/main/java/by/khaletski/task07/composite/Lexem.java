package by.khaletski.task07.composite;

import java.util.List;

public class Lexem extends Composite {

    public Lexem(List<Symbol> symbols) {
        symbols.forEach(this::add);
    }

    public Lexem(char... symbols) {
        for (char symbol : symbols) {
            this.add(new Symbol(symbol));
        }
    }

    @Override
    public void printThisBefore() {
        System.out.print(" ");
    }
}
