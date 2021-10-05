package by.khaletski.task07.service.parser;

import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements Parser {
    private static final String SENTENCE_REGEX = "\\b[^.!?]+[.!?]+";
    private final LexemeParser lexemeParser = new LexemeParser();

    @Override
    public void parse(Composite paragraphComposite, String paragraph) {
        Composite sentenceComposite;
        String sentenceString;
        Pattern sentencePattern = Pattern.compile(SENTENCE_REGEX);
        Matcher matcher = sentencePattern.matcher(paragraph);
        while (matcher.find()) {
            sentenceString = matcher.group();
            sentenceComposite = new Composite(Type.SENTENCE);
            lexemeParser.parse(sentenceComposite, sentenceString);
            paragraphComposite.add(sentenceComposite);
        }
    }
}
