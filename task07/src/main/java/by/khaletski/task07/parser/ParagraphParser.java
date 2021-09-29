package by.khaletski.task07.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParagraphParser {

    public List<String> parseParagraphs() {
        List<String> paragraphs = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/main/java/by/khaletski/task07/dao/text.txt"))) {
            while (scanner.hasNextLine()) {
                paragraphs.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return paragraphs;
    }
}