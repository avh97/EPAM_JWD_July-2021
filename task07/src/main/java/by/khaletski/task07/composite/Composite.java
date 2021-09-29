package by.khaletski.task07.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Component {

    private final List<Composite> children = new ArrayList<>();

    @Override
    public void add(Composite letter) {
        children.add(letter);
    }

    @Override
    public int count() {
        return children.size();
    }

    @Override
    public void printThisBefore() {
    }

    @Override
    public void printThisAfter() {
    }

    @Override
    public void print() {
        printThisBefore();
        children.forEach(Composite::print);
        printThisAfter();
    }
}

