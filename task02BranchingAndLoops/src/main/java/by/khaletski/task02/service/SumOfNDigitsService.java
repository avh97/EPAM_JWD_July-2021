package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * This class creates 'SumOfEvenDigitsService' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class SumOfNDigitsService {
    private ArrayList<Integer> numbers;

    static final Logger LOGGER = LogManager.getLogger(SumOfNDigitsService.class);

    /**
     * This constructor creates 'SumOfNDigitsService' object consisting of numberOfDigits digit numbers.
     *
     * @param numberOfDigits
     * @param desiredSumOfDigits
     */

    public SumOfNDigitsService(final int numberOfDigits, final int desiredSumOfDigits) {
        if (numberOfDigits < 1) {
            LOGGER.error("Object 'SumOfNDigitsService' has not been successfully created");
            throw new IllegalArgumentException("Number of digits cannot be less than 1");
        } else {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = (int) Math.pow(10, numberOfDigits - 1); i <= Math.pow(10, (numberOfDigits)); i++) {
                numbers.add(i);
            }
            Iterator<Integer> iterator = numbers.iterator();
            int desiredSum = desiredSumOfDigits;
            while (iterator.hasNext()) {
                int n = iterator.next();
                int sum = 0;
                while (n != 0) {
                    sum = sum + n % 10;
                    n = n / 10;
                }
                if (sum != desiredSum) {
                    iterator.remove();
                }
            }
            this.numbers = numbers;
            LOGGER.debug("Object 'SumOfNDigitsService' has been successfully created");
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "" + numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfNDigitsService that = (SumOfNDigitsService) o;
        return numbers.equals(that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
