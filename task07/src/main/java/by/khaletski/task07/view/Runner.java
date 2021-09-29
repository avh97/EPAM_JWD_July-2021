package by.khaletski.task07.view;

import by.khaletski.task07.composite.Lexem;
import by.khaletski.task07.parser.SymbolParser;
import by.khaletski.task07.parser.LexemParser;
import by.khaletski.task07.parser.ParagraphParser;
import by.khaletski.task07.parser.SentenceParser;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> paragraphs = new ParagraphParser().parseParagraphs();
        List<String> sentences = new SentenceParser().parseSentences();
        List<String> lexems = new LexemParser().parseLexems();
        List<String> symbols = new SymbolParser().parseCharacters();
//        System.out.println(paragraphs);
//        System.out.println(sentences);
//        System.out.println(lexems);
//        System.out.println(symbols);

        Lexem lexem = new Lexem()

//        for (int i = 0; i < sentences.size(); i++) {
//            System.out.println(sentences.get(i));
//            System.out.println(i);
//        }
//        for (int i = 0; i < lexems.size(); i++) {
//            System.out.println(lexems.get(i));
//            System.out.println(i);
    }
}
