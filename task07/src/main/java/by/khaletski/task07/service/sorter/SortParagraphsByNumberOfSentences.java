package by.khaletski.task07.service.sorter;

import by.khaletski.task07.service.composite.Component;
import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortParagraphsByNumberOfSentences {

    public List<Component> sort(Composite text) {
        List<Component> paragraphList = new ArrayList<>();
        for (Component paragraph : text.getComponentList()) {
            if (paragraph.getType() == Type.PARAGRAPH) {
                paragraphList.add(paragraph);
            }
        }
        List<Component> result = new ArrayList<>(paragraphList);
        result.sort(Comparator.comparingInt(paragraph -> getNumberOfSentences((Composite) paragraph)));
        return result;
    }

    private int getNumberOfSentences(Composite paragraph) {
        int count = 0;
        for (Component sentence : paragraph.getComponentList()) {
            if (sentence.getType() == Type.SENTENCE) {
                count++;
            }
        }
        return count;
    }
}