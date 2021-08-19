package by.khaletski.task03.dao.impl;

import by.khaletski.task03.dao.INumberArrayFill;
import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberArrayFill implements INumberArrayFill {

    static final Logger LOGGER = LogManager.getLogger(NumberArrayFill.class);

    @Override
    public final NumberArray fill() throws DAOException {
        File file = new File("array.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LOGGER.error("NumberArray has not been filled.");
        }
        String str = scanner.nextLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        LOGGER.debug("NumberArray has been filled.");
        return new NumberArray(numArr);
    }
}
