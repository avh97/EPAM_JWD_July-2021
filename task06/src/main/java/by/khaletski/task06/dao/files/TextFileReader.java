package by.khaletski.task06.dao.files;

import by.khaletski.task06.entity.Cone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextFileReader {
    static final Logger LOGGER = LogManager.getLogger(TextFileReader.class);
    private static final TextFileReader INSTANCE = new TextFileReader();

    public static final TextFileReader getInstance() {
        return INSTANCE;
    }

    public Map<Integer, Cone> read() {
        Map<Integer, Cone> storage = new HashMap<>();
        Path path = Paths.get("src/main/java/by/khaletski/task06/dao/files/storage.txt");
        List<String> lines = new ArrayList<>();
        try (Stream<String> lineStream = Files.lines(path)) {
            lines = lineStream.
                    map(s -> s.replace("Cone: inner point: ", "")
                            .replace(", inner point: ", " ")
                            .replace(", outer point: ", " ")
                            .replace(", upper point: ", " "))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int index = 0; index < lines.size(); index++) {
            try {
                double[] array = Arrays.stream(lines.get(index).split(" "))
                        .mapToDouble(Double::parseDouble).toArray();
                if (array.length == 9) {
                    storage.put(index, (new Cone(new Cone.Point(array[0], array[1], array[2]),
                            new Cone.Point(array[3], array[4], array[5]),
                            new Cone.Point(array[6], array[7], array[8]))));
                }
            } catch (NumberFormatException ignored) {
                LOGGER.info("Line %d is invalid".formatted(index));
            }
        }
        return storage;
    }
}
