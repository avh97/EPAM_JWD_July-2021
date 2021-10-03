package by.khaletski.task07;

import by.khaletski.task07.dao.TextReader;
import by.khaletski.task07.entity.Type;
import by.khaletski.task07.service.Composite;
import by.khaletski.task07.service.Parser;

public class Runner {
    public static void main(String[] args) {
        String text = new TextReader().readText();
        Parser parser = new Parser();

        Composite textComposite = (Composite) parser.parse(text, Type.TEXT);
        System.out.println(textComposite.collect());
        System.out.println();

        Composite paragraphComposite = (Composite) textComposite.getComponents().get(0);
        System.out.println(paragraphComposite.collect());
        System.out.println();

        Composite sentenceComposite = (Composite) paragraphComposite.getComponents().get(1);
        System.out.println(sentenceComposite.collect());
        System.out.println();

        Composite wordComposite = (Composite) sentenceComposite.getComponents().get(3);
        System.out.println(wordComposite.collect());

        System.out.println(parser.getSortedWordsBySize(textComposite));
    }
}
