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
 * This class creates 'CocktailSortService' objects
 * Cocktail Sort is a variation of Bubble sort. The Bubble sort algorithm always traverses elements from left and
 * moves the largest element to its correct position. Cocktail Sort traverses through a given array in both directions
 * alternatively.
 * Complexity: O(n * 2})
 *
 * @author Anton Khaletski
 * @version 1.0
 */


public class CocktailSortService implements ISortService {

    static final Logger LOGGER = LogManager.getLogger(CocktailSortService.class);

    @Override
    public final NumberArray sort(final NumberArray numberArray) {
        int[] array = numberArray.getArray();
        int tempVariable;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    tempVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempVariable;
                }
            }
            right--; //TODO запомнить момент последнего обмена
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    tempVariable = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tempVariable;
                }
            }
            left++;
        } while (left < right);
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
