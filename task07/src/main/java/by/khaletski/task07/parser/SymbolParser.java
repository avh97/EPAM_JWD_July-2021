package by.khaletski.task07.parser;

import java.util.ArrayList;
import java.util.List;

public class SymbolParser {

    public List<String> parseCharacters() {
        List<String> lexems = new LexemParser().parseLexems();
        List<String> symbols = new ArrayList<>();
        for (int i = 0; i < lexems.size(); i++) {
            char[] chars = lexems.get(i).toCharArray();
            for (int k = 0; k < chars.length; k++) {
                symbols.add(String.valueOf(chars[k]));
            }
        }
        return symbols;
    }
}
