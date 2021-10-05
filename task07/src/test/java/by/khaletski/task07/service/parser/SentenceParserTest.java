package by.khaletski.task07.service.parser;

import by.khaletski.task07.dao.ReadText;
import by.khaletski.task07.service.composite.Component;
import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SentenceParserTest {

    @Test
    public void sentenceParserTest() {
        List<String> expected = Arrays.asList("2", "2", "1", "1");
        List<String> actual = new ArrayList<>();
        String textString = new ReadText().read();
        TextParser textParser = new TextParser();
        Composite textComposite = new Composite(Type.TEXT);
        textParser.parse(textComposite, textString);
        for (Component paragraph : textComposite.getComponentList()) {
            if (paragraph.getType() == Type.PARAGRAPH) {
                Composite paragraphComposite = (Composite) paragraph;
                int number = 0;
                for (Component sentence : paragraphComposite.getComponentList()) {
                    if (sentence.getType() == Type.SENTENCE) {
                        number++;
                    }
                }
                actual.add(String.valueOf(number));
            }
        }
        assertEquals(actual, expected);
    }
}
