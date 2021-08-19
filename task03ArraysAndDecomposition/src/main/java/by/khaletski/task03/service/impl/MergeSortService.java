package by.khaletski.task03.service.impl;

import by.khaletski.task03.dao.exception.DAOException;
import by.khaletski.task03.dao.factory.DAOFactory;
import by.khaletski.task03.entity.NumberArray;
import by.khaletski.task03.service.ISortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;

/**
 * This class creates 'MergeSortService' objects.
 * Merge Sort algorithm can be described as the following 2 step process:
 * 1) Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array.
 * This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
 * 2) Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.
 * Complexity: O(n log n)
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class MergeSortService implements ISortService {

    static final Logger LOGGER = LogManager.getLogger(MergeSortService.class);

    @Override
    public final NumberArray sort(final NumberArray numberArray) {
        int[] array1 = numberArray.getArray();
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, array1.length);
        return new NumberArray(result);
    }

    /**
     * This method sorts inner array.
     *
     * @param buffer1      array to be sorted
     * @param buffer2      buffer, which size must me equal to buffer1.
     * @param startIndex   starting index in buffer1 for sorting.
     * @param extremeIndex extreme index in buffer1 for sorting.
     * @return sorted array
     */

    private int[] mergeSortInner(final int[] buffer1, final int[] buffer2,
                                 final int startIndex, final int extremeIndex) {
        if (startIndex >= extremeIndex - 1) {
            return buffer1;
        }
        // already sorted
        int middle = startIndex + (extremeIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, extremeIndex);
        // merging
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < extremeIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < extremeIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
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
