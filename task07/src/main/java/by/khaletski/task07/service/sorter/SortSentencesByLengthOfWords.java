package by.khaletski.task07.service.sorter;

import by.khaletski.task07.service.composite.Component;
import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Type;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortSentencesByLengthOfWords {

    public List<Component> sort(Composite textComposite) {
        List<Component> sentenceList = new ArrayList<>();
        for (Component paragraph : textComposite.getComponentList()) {
            if (paragraph.getType() == Type.PARAGRAPH) {
                Composite paragraphComposite = (Composite) paragraph;
                for (Component sentence : paragraphComposite.getComponentList()) {
                    if (sentence.getType() == Type.SENTENCE) {
                        sentenceList.add(sentence);
                    }
                }
            }
        }
        List<Component> result = new ArrayList<>(sentenceList);
        result.sort(Comparator.comparingInt(sentence -> findLengthOfLexemes((Composite) sentence)));
        return result;
    }

    private int findLengthOfLexemes(Composite sentenceComposite) {
        int length = 0;
        for (Component lexeme : sentenceComposite.getComponentList()) {
            if (lexeme.getType() == Type.LEXEME) {
                Composite lexemeComposite = (Composite) lexeme;
                for (Component leaf : lexemeComposite.getComponentList()) {
                    if (leaf.getType() == Type.SYMBOL) {
                        length++;
                    }
                }
            }
        }
        return length;
    }
}
