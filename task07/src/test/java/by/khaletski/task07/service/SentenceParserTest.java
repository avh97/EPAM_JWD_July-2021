package by.khaletski.task07.service;

import by.khaletski.task07.dao.TextReader;
import by.khaletski.task07.entity.Type;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SentenceParserTest {
    @Test
    public void testSentenceParserService() {
        String text = new TextReader().readText();
        Parser parser = new Parser();
        Composite textComposite = (Composite) parser.parse(text, Type.TEXT);
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = 0; a < textComposite.getComponents().size(); a++) {
            Composite sentenceComposite = (Composite) parser.parse(textComposite.getComponents().get(a).collect(),
                    Type.SENTENCE);
            for (int b = 0; b < sentenceComposite.getComponents().size(); b++) {
                stringBuilder.append(sentenceComposite.getComponents().get(b).collect());
            }
        }
        char[] expected = text.toCharArray();
        char[] actual = stringBuilder.toString().toCharArray();
        assertEquals(actual, expected);
    }
}
