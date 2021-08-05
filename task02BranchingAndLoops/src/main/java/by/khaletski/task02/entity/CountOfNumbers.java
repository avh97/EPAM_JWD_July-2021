package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/** This class is used to create the 'CountOfNumbers' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class CountOfNumbers {
    ArrayList<Double> numbers = new ArrayList<>();

    static final Logger LOGGER = LogManager.getLogger(CountOfNumbers.class);

    /**
     * Default constructor creates a 'CountOfNumbers' object.
     * @param numbers   ArrayList of doubles
     */

    public CountOfNumbers(final ArrayList<Double> numbers) {
        this.numbers = numbers;
        LOGGER.debug("Object 'CountOfNumbers' has been successfully created");
    }

    /**
     * This constructor creates a 'CountOfNumbers' object and fills it with three
     * following doubles.
     * @param numberA   first double
     * @param numberB   second double
     * @param numberC   third double
     */

    public CountOfNumbers(final double numberA, final double numberB, final double numberC) {
        numbers.add(numberA);
        numbers.add(numberB);
        numbers.add(numberC);
        LOGGER.debug("Object 'CountOfNumbers' has been successfully created");
    }

    /**
     * This method receives an ArrayList of numbers and returns the total
     * count of positive numbers in this ArrayList.
     * @return
     */

    public int positiveNumbersCounter() {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void printPositiveNumbersCount() {
        System.out.println("Задача №2.19. Подсчитать количество положительных среди чисел а, b, с");
        System.out.println("Количество положительных чисел: " + positiveNumbersCounter());
    }

}
