package by.khaletski.task07.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadText {
    private static final Logger LOGGER = LogManager.getLogger();

    public String read() {
        Path path = Path.of("src/main/resources/text.txt");
        String text = "";
        try {
            text = Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.info("Text has been read.");
        return text;
    }
}
