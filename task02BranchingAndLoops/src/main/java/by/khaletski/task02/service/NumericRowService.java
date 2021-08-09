package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class creates the 'NumericRowService' objects with properties
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class NumericRowService {
    private ArrayList<Double> numericRow;
    private int sizeOfRow;
    private double numberE;

    static final Logger LOGGER = LogManager.getLogger(NumericRowService.class);

    /**
     * This constructor creates a 'NumericRow' object, which creates a number series.
     * The general term of the series is: a (n-th) = 1/2^n + 1/3^n = 1/4^n ...
     *
     * @param sizeOfRow
     * @param numberE
     */

    public NumericRowService(final int sizeOfRow, final double numberE) {
        if (sizeOfRow < 0) {
            LOGGER.error("Object 'NumericRowService' has not been successfully created");
            throw new IllegalArgumentException("Size of number row cannot be negative");
        } else {

            ArrayList<Double> numbers = new ArrayList<>();
            double denominator = 1;
            int counter = 0;
            while (counter < sizeOfRow) {
                numbers.add(counter, 1 / (denominator * (counter + 1)));
                counter++;
                denominator++;
            }
            this.sizeOfRow = sizeOfRow;
            this.numberE = numberE;
            numericRow = numbers;
        }
        LOGGER.debug("Object 'NumericRowService' has been successfully created");
    }

    public ArrayList<Double> getNumericRow() {
        return numericRow;
    }

    /**
     * This function finds the sum of those numbers in NumericRowService,
     * whose modulus is greater or equal than given 'e'.
     *
     * @return total sum of numbers, whose modulus is equal or equal than given 'e'
     */

    public double sumOfNumbers() {
        Iterator<Double> iterator = numericRow.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            if (Math.abs(iterator.next()) >= numberE) {
                sum = sum + iterator.next();
            }
        }
        return sum;
    }
}
