package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

/** This creates 'SumOfEvenDigitsService' objects with properties/
 @author Anton Khaletski
 @version 1.0
 */

public class SumOfEvenDigitsService {
    private int number;

    static final Logger LOGGER = LogManager.getLogger(SumOfEvenDigitsService.class);

    /**
     * Default constructor creates 'SumOfEvenDigitsService' object.
     * @param number number of even digits in the number, reversed
     */

    public SumOfEvenDigitsService(int number) {
        number = Math.abs(number);
        int lastDigit = 0;
        int evenDigitSum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            number = number / 10;
        }
        int reverse = 0;
        while (evenDigitSum != 0) {
            int remainder = evenDigitSum % 10;
            reverse = reverse * 10 + remainder;
            evenDigitSum = evenDigitSum / 10;
        }
        this.number = reverse;
        LOGGER.debug("Object 'SumOfEvenDigitsService' has been successfully created");
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfEvenDigitsService that = (SumOfEvenDigitsService) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "SumOfEvenDigitsService{" +
                "number=" + number +
                '}';
    }
}
