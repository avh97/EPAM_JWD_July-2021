package by.khaletski.task07.service.parser;

import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements Parser {
    private static final String PARAGRAPH_REGEX = "(=?([A-z-()0-9<>|&~,.' ]+))";
    private SentenceParser sentenceParser = new SentenceParser();

    @Override
    public void parse(Composite textComposite, String text) {
        Composite paragraphComposite;
        String paragraphString;
        Pattern paragraphPattern = Pattern.compile(PARAGRAPH_REGEX);
        Matcher matcher = paragraphPattern.matcher(text);
        while (matcher.find()) {
            paragraphString = matcher.group();
            paragraphComposite = new Composite(Type.PARAGRAPH);
            sentenceParser.parse(paragraphComposite, paragraphString);
            textComposite.add(paragraphComposite);
        }
    }
}
