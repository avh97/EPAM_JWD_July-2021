package by.khaletski.task07.composite;

import java.util.List;

public class Sentence extends Composite {

    public Sentence(List<Lexem> lexems) {
        lexems.forEach(this::add);
    }

    @Override
    public void printThisAfter() {

    }
}
