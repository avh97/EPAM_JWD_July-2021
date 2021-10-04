package by.khaletski.task07.service.parser;

import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser implements Parser {
    private static final String LEXEME_REGEX = "([^\\s]+)";
    private SymbolParser symbolParser = new SymbolParser();

    @Override
    public void parse(Composite sentenceComposite, String sentence) {
        Composite lexemeComposite;
        String lexemeString;
        Pattern lexemePattern = Pattern.compile(LEXEME_REGEX);
        Matcher matcher = lexemePattern.matcher(sentence);
        while (matcher.find()) {
            lexemeString = matcher.group();
            lexemeComposite = new Composite(Type.SENTENCE);
            symbolParser.parse(lexemeComposite, lexemeString);
            sentenceComposite.add(lexemeComposite);
        }
    }
}
