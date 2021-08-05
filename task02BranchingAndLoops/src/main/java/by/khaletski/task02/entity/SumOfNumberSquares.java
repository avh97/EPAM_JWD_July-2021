package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

/** This class is used to create the 'SumOfNumberSquares' objects with properties
 @author Anton Khaletski
 @version 1.0
 */

public class SumOfNumberSquares {
    private ArrayList<Integer> numbers;

    static final Logger LOGGER = LogManager.getLogger(SumOfNumberSquares.class);

    /**
     * This constructor creates an SumOfNumberSquares object, which contains an ArrayList
     * consisting of numbers in the range startValue and extremeValue.
     * @param startValue
     * @param extremeValue
     */

    public SumOfNumberSquares(final int startValue, final int extremeValue) {
        ArrayList<Integer> all = new ArrayList<>(Math.abs(startValue - extremeValue));
        for (int i = startValue; i <= extremeValue; i++) {
            all.add(i);
        }
        this.numbers = all;
        LOGGER.debug("Object 'SumOfNumberSquares' has been successfully created");
    }

    /**
     * This method finds the sum of squares of the elements from the given ArrayList
     * @return
     */

    public int sumOfSquares() {
        Iterator<Integer> iterator = numbers.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            sum = sum + number * number;
        }
        return sum;
    }

    public void printSumOfSquares() {
        System.out.println("Задача №3.9. Найти сумму квадратов чисел.");
        System.out.println("Сумма квадратов: " + sumOfSquares());
    }
}
