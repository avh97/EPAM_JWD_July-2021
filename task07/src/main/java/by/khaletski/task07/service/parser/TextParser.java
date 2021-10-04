package by.khaletski.task07.service.parser;

import by.khaletski.task07.service.composite.Composite;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextParser implements Parser {
    private static final Logger LOGGER = LogManager.getLogger();
    private ParagraphParser paragraphParser = new ParagraphParser();

    @Override
    public void parse(Composite textComposite, String text) {
        paragraphParser.parse(textComposite, text);
        LOGGER.info("Text has been successfully parsed");
    }
}
