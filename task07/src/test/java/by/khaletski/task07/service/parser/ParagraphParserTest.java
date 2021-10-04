package by.khaletski.task07.service.parser;

import by.khaletski.task07.dao.ReadText;
import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParagraphParserTest {

    @Test
    public void paragraphParserTest() {
        int expectedSize = 4;
        String text = new ReadText().read();
        Composite textComposite = new Composite(Type.TEXT);
        new TextParser().parse(textComposite, text);
        assertEquals(textComposite.size(), expectedSize);
    }
}
