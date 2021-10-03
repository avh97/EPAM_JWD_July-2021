package by.khaletski.task07.dao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReader {
    public String readText() {
        Path path = Path.of("src/main/resources/text.txt");
        String text = "";
        try {
            text = Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
