package by.khaletski.task07.composite;

public class Symbol extends Composite {

    private final char character;

    public Symbol(char c) {
        this.character = c;
    }

    @Override
    public void printThisBefore() {
        System.out.print(character);
    }
}
