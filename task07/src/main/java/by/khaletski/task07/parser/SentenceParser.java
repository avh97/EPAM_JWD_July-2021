package by.khaletski.task07.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser {
    static final String SENTENCE = "\\s+[^.!?]*[.!?]";

    public List<String> parseSentences() {
        List<String> paragraphs = new ParagraphParser().parseParagraphs();
        List<String> sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile(SENTENCE);
        for (int i = 0; i < paragraphs.size(); i++) {
            Matcher matcher = pattern.matcher(paragraphs.get(i));
            while (matcher.find()) {
                sentences.add(matcher.group());
            }
        }
        return sentences;
    }
}
