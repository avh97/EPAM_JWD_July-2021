package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/** This class creates the 'CountOfNumbersService' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class CountOfNumbersService {
    private ArrayList<Double> numbers = new ArrayList<>();

    static final Logger LOGGER = LogManager.getLogger(CountOfNumbersService.class);

    /**
     * Default constructor creates a 'CountOfNumbersService' object.
     * @param numbers ArrayList of doubles
     */

    public CountOfNumbersService(final ArrayList<Double> numbers) {
        this.numbers = numbers;
        LOGGER.debug("Object 'CountOfNumbersService' has been successfully created");
    }

    /**
     * This constructor creates an 'CountOfNumbersService' object and adds three numbers.
     * @param numberA
     * @param numberB
     * @param numberC
     */

    public CountOfNumbersService(final double numberA, final double numberB, final double numberC) {
        numbers.add(numberA);
        numbers.add(numberB);
        numbers.add(numberC);
        LOGGER.debug("Object 'CountOfNumbersService' has been successfully created");
    }

    /**
     * This method receives an ArrayList of numbers and returns the total
     * count of positive numbers in this ArrayList.
     * @return total count of positive numbers
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
}
