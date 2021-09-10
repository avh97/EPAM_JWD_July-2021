package by.khaletski.task03.service.creator;

import by.khaletski.task03.entity.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MatrixFillServiceCreator {

    static final Logger LOGGER = LogManager.getLogger(MatrixFillServiceCreator.class);

    public final Matrix fillFrom(final String path) {
        File file = new File(path);
        Matrix p = null;
        Scanner scanner;
        int lines;
        int columns;
        try {
            scanner = new Scanner(file);
            lines = lineCounter(file);
            columns = columnCounter(file);
            p = new Matrix(lines, columns);
            for (int i = 0; i < lines; i++) {
                String[] numbers = scanner.nextLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    p.setElement(i, j, Integer.parseInt(numbers[j]));
                }
            }
            scanner.close();
        } catch (IOException e) {
            LOGGER.error("Matrix cannot be filled.");
            e.printStackTrace();
        }
        LOGGER.debug("Matrix has been filled.");
        return p;
    }

    private int lineCounter(final File file) throws IOException {
        int lines = 0;
        FileReader fileReader = new FileReader(file);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                lines++;
            }
        }
        fileReader.close();
        return lines;
    }

    private int columnCounter(final File file) throws IOException {
        Scanner sizeScanner = new Scanner(file);
        String[] temp = sizeScanner.nextLine().split(" ");
        sizeScanner.close();
        return temp.length;
    }
}

