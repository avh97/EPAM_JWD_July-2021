package by.khaletski.task07.parser;

import by.khaletski.task07.entity.Symbol;
import by.khaletski.task07.entity.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public Component parse(String string, Type type) {
        if (string.length() == 0) return null;
        if (string.length() == 1) {
            return new Symbol(string.charAt(0));
        }
        Composite composite = new Composite(type);
        String[] splitted = string.split(type.getRegexForSplit());
        for (String s : splitted) {
            Component parse = parse(s, type.getChild());
            composite.addComponent(parse);
        }
        return composite;
    }

    public List<Component> getParagraphs(Composite composite) {
        if (composite.getType().ordinal() > Type.PARAGRAPH.ordinal())
            return Collections.emptyList();
        if (composite.getType().equals(Type.TEXT))
            return composite.getComponents();
        ArrayList<Component> components = new ArrayList<>();
        components.add(composite);
        return components;
    }

    public List<Component> getSentences(Composite composite) {
        Type sentenceType = Type.SENTENCE;
        if (composite.getType().ordinal() > sentenceType.ordinal())
            return Collections.emptyList();

        if (composite.getType().equals(sentenceType)) {
            ArrayList<Component> components = new ArrayList<>();
            components.add(composite);
            return components;
        }

        List<Component> paragraphs = getParagraphs(composite);
        List<Component> sentences = new ArrayList<>();
        for (Component p : paragraphs) {
            Composite paragraph = (Composite) p;
            sentences.addAll(paragraph.getComponents());
        }
        return sentences;
    }

    public List<Component> getWords(Composite composite) {
        Type wordType = Type.WORD;
        if (composite.getType().ordinal() > wordType.ordinal())
            return Collections.emptyList();

        if (composite.getType().equals(wordType)) {
            ArrayList<Component> components = new ArrayList<>();
            components.add(composite);
            return components;
        }

        List<Component> sentences = getSentences(composite);
        List<Component> words = new ArrayList<>();
        for (Component sentence : sentences) {
            Composite s = (Composite) sentence;
            for (Component wordOrSymbol : s.getComponents()) {
                if (wordOrSymbol.getType().equals(wordType)) words.add(wordOrSymbol);
            }
        }
        return words;
    }

    public int getNumberOfParagraphs(Composite composite) {
        return getParagraphs(composite).size();
    }

    public int getNumberOfSentences(Composite composite) {
        return getSentences(composite).size();
    }

    public int getNumberOfWords(Composite composite) {
        return getWords(composite).size();
    }

    public List<Component> getSortedParagraphsByNumberOfSentences(Composite composite) {
        Parser parser = new Parser();
        List<Component> paragraphs = parser.getParagraphs(composite);
        return null;
    }

    public List<Component> getSortedWordsBySize(Composite composite) {
        Parser parser = new Parser();
        List<Component> words = parser.getWords(composite);
        words.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Composite && o2 instanceof Composite) {
                    Composite c1 = (Composite) o1;
                    Composite c2 = (Composite) o2;
                    Integer i1 = c1.getComponents().size();
                    Integer i2 = c2.getComponents().size();
                    return i1.compareTo(i2);
                }
                return 0;
            }
        });
        return words;
    }
}
