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
        List<String> expectedNumbers = Arrays.asList("2", "2", "1", "1");
        String wholeText = new ReadText().read();
        Composite textComposite = new Composite(Type.TEXT);
        new TextParser().parse(textComposite, wholeText);
        List<String> numbersOfSentences = new ArrayList<>();
        for (Component paragraph : textComposite.getComponentList()) {
            if (paragraph.getType() == Type.PARAGRAPH) {
                Composite paragraphComposite = (Composite) paragraph;
                int number = 0;
                for (Component sentence : paragraphComposite.getComponentList()) {
                    if (sentence.getType() == Type.SENTENCE) {
                        number++;
                    }
                }
                numbersOfSentences.add(String.valueOf(number));
            }
        }
        assertEquals(numbersOfSentences, expectedNumbers);
    }
}
