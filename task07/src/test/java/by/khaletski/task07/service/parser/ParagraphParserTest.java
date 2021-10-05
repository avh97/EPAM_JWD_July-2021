package by.khaletski.task07.service.parser;

import by.khaletski.task07.dao.ReadText;
import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParagraphParserTest {

    @Test
    public void paragraphParserTest() {
        String text = new ReadText().read();
        TextParser textParser = new TextParser();
        Composite textComposite = new Composite(Type.TEXT);
        textParser.parse(textComposite, text);
        int expected = 4;
        int actual = textComposite.size();
        assertEquals(actual, expected);
    }
}
