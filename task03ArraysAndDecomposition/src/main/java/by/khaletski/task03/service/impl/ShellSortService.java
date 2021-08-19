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
 * This class creates 'ShellSortService' objects.
 * Shell Sort is an improved version of Insertion Sort. The idea is to compare elements that are not only next
 * to each other, but also at a certain distance from each other. In other words, it is sorting by inserts with
 * preliminary "rough" passes.
 * Complexity: O(1)
 * @author Anton Khaletski
 * @version 1.0
 */

public class ShellSortService implements ISortService {

    static final Logger LOGGER = LogManager.getLogger(ShellSortService.class);

    @Override
    public final NumberArray sort(final NumberArray numberArray) {
        int[] array = numberArray.getArray();
        int i;
        int j;
        int temp;
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (i = step; i < array.length; i++) {
                temp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (temp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
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
