package by.khaletski.task07.service.parser;

import by.khaletski.task07.service.composite.Composite;
import by.khaletski.task07.service.composite.Symbol;
import by.khaletski.task07.service.composite.Type;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolParser implements Parser {
    private static final String SYMBOL_REGEX = "(\\w)|([^\\w\\s])";

    @Override
    public void parse(Composite lexemeComposite, String lexeme) {
        Symbol symbol;
        String leafString;
        Pattern leafPattern = Pattern.compile(SYMBOL_REGEX);
        Matcher matcher = leafPattern.matcher(lexeme);
        for (int i = 0; i < lexeme.length(); i++) {
            if (matcher.find()) {
                leafString = matcher.group();
                symbol = new Symbol(leafString, Type.SYMBOL);
                lexemeComposite.add(symbol);
            }
        }
    }
}
