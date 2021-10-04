package by.khaletski.task07.service.sorter;

import by.khaletski.task07.dao.ReadText;
import by.khaletski.task07.service.composite.Component;
import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;
import by.khaletski.task07.service.parser.TextParser;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SortSentencesByLengthOfWordsTest {

    @Test
    public void sortSentencesByLengthOfLexemesTest() {
        String wholeText = new ReadText().read();
        Composite textComposite = new Composite(Type.TEXT);
        new TextParser().parse(textComposite, wholeText);
        List<Component> sortedSentenceList = new SortSentencesByLengthOfWords().sort(textComposite);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < sortedSentenceList.size(); i++) {
            result.add(sortedSentenceList.get(i).toString());
        }
        System.out.println(result);
    }
}
