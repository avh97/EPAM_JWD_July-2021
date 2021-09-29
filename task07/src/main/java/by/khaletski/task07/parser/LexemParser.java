package by.khaletski.task07.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemParser {
    static final String LEXEM = "(\\s{1,5}[A-z-()0-9<>|&~,.']*)";

    public List<String> parseLexems() {
        List<String> sentences = new SentenceParser().parseSentences();
        List<String> lexems = new ArrayList<>();
        Pattern pattern = Pattern.compile(LEXEM);
        for (int i = 0; i < sentences.size(); i++) {
            Matcher matcher = pattern.matcher(sentences.get(i));
            while (matcher.find()) {
                lexems.add(matcher.group());
            }
        }
        return lexems;
    }
}
