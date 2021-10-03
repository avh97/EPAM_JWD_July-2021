package by.khaletski.task07;

import by.khaletski.task07.parser.Composite;
import by.khaletski.task07.parser.Parser;
import by.khaletski.task07.entity.Type;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Runner {
    public static void main(String[] args) {

        Path path = Path.of("src/main/java/by/khaletski/task07/dao/text.txt");
        String text = "";
        try {
            text = Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parser parser = new Parser();
        Composite textComposite = (Composite) parser.parse(text, Type.TEXT);
//        System.out.println(textComposite.toString());
//        System.out.println(textComposite.collect());

//        Composite paragraghComposite = (Composite) textComposite.getComponents().get(0);
//        System.out.println(paragraghComposite.toString());
//        System.out.println(paragraghComposite.collect());

//        parser.getNumberOfSentences(textComposite);
//        System.out.println((parser.sortByNumberOfSentences(textComposite);
//        System.out.println(parser.getSortedWordsBySize(textComposite));
        System.out.println(parser.getParagraphs(textComposite));
    }
}
