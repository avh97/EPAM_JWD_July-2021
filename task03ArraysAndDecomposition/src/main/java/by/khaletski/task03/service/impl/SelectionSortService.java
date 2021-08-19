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
 * This class creates 'SelectionSortService' objects.
 * The algorithm divides the input list into two parts:
 * 1) a sorted sublist of items from left to right of the list and
 * 2) a sublist of the remaining unsorted items that occupy the rest of the list.
 * The algorithm proceeds by finding the smallest (in this case) element in the unsorted sublist, swapping it with the
 * leftmost unsorted element, and moving the sublist boundaries one element to the right.
 * Complexity: О(n^{2})
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class SelectionSortService implements ISortService {

    static final Logger LOGGER = LogManager.getLogger(SelectionSortService.class);

    @Override
    public final NumberArray sort(final NumberArray numberArray) {
        int[] array = numberArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
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
