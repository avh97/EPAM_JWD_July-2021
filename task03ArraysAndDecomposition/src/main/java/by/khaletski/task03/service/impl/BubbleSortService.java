package by.khaletski.task03.service.impl;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.dao.factory.DAOFactory;
import by.khaletski.task03.entity.NumberArray;
import by.khaletski.task03.service.ISortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.Objects;

/**
 * This class creates 'BubbleSortService' objects.
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are
 * in wrong order.
 * Complexity: О(n^{2})
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class BubbleSortService implements ISortService {

    static final Logger LOGGER = LogManager.getLogger(BubbleSortService.class);

    @Override
    public final NumberArray sort(final NumberArray numberArray) {
        int[] array = numberArray.getArray();
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return new NumberArray(array);
    }

    public final NumberArray sort() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        NumberArray numberArray = null;
        try {
            numberArray = daoFactory.getNumberArrayFill().fill();
        } catch (FileNotFoundException | DAOException e) {
            LOGGER.error("Cannot access data.");
            e.printStackTrace();
        }
        return sort(Objects.requireNonNull(numberArray));
    }
}
