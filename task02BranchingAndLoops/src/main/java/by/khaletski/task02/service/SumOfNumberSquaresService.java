package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class creates 'SumOfNumberSquaresService' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class SumOfNumberSquaresService {
    private ArrayList<Integer> numbers;

    static final Logger LOGGER = LogManager.getLogger(SumOfNumberSquaresService.class);

    /**
     * This constructor creates an SumOfNumberSquaresService object, which contains an ArrayList
     * consisting of numbers in the range startValue and extremeValue.
     *
     * @param startValue
     * @param extremeValue
     */

    public SumOfNumberSquaresService(final int startValue, final int extremeValue) {
        ArrayList<Integer> all = new ArrayList<>(Math.abs(startValue - extremeValue));
        for (int i = startValue; i <= extremeValue; i++) {
            all.add(i);
        }
        this.numbers = all;
        LOGGER.debug("Object 'SumOfNumberSquaresService' has been successfully created");
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    /**
     * This method finds the sum of squares of the elements from the given ArrayList.
     *
     * @return sum of squares of each element
     */

    public int sumOfSquares() {
        Iterator<Integer> iterator = getNumbers().iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            sum = sum + number * number;
        }
        return sum;
    }
}
