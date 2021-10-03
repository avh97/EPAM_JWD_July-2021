package by.khaletski.task07.service;

import by.khaletski.task07.dao.TextReader;
import by.khaletski.task07.entity.Type;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParagraphParserTest {
    @Test
    public void testParagraphParserService() {
        String text = new TextReader().readText();
        Parser parser = new Parser();
        Composite textComposite = (Composite) parser.parse(text, Type.TEXT);
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = 0; a < textComposite.getComponents().size(); a++) {
            stringBuilder.append(textComposite.getComponents().get(a).collect());
        }
        char[] expected = text.toCharArray();
        char[] actual = stringBuilder.toString().toCharArray();
        assertEquals(actual, expected);
    }
}
