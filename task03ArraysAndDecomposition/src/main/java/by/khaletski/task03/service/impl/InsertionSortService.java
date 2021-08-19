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
 * This class creates 'InsertionSortService' objects.
 * Insertion Sort a sorting algorithm in which the elements of the input sequence are scanned one at a time,
 * and each new element arriving is placed in a suitable place among the previously ordered elements.
 * Complexity: O(n^{2})
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class InsertionSortService implements ISortService {

    static final Logger LOGGER = LogManager.getLogger(InsertionSortService.class);

    @Override
    public final NumberArray sort(final NumberArray numberArray) {
        int[] array = numberArray.getArray();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
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
