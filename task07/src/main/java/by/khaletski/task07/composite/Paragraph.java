package by.khaletski.task07.composite;

import java.util.List;

public class Paragraph extends Composite {

    public Paragraph(List<Sentence> sentences) {
        sentences.forEach(this::add);
    }

    @Override
    public void printThisAfter() {
        System.out.print("\n");
    }
}

