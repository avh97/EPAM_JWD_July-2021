package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

/** This class is used to create the 'SumOfEvenDigits' objects with properties
 @author Anton Khaletski
 @version 1.0
 */

public class SumOfEvenDigits {
    private int number;

    static final Logger LOGGER = LogManager.getLogger(SumOfEvenDigits.class);

    /**
     * Default constructor creates 'SumOfEvenDigits' object
     * @param number
     */

    public SumOfEvenDigits(int number) {
        this.number = number;
        LOGGER.debug("Object 'SumOfEvenDigits' has been successfully created");
    }

    /**
     * This method finds the sum of even digits of each element in the ArrayList
     * @return
     */

    public SumOfEvenDigits sumOfEvenDigits() {
            int lastDigit = 0;
            int evenDigitSum = 0;
            while (number != 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    evenDigitSum += lastDigit;
                }
                number = number / 10;
            }
        return new SumOfEvenDigits(Math.abs(evenDigitSum));
    }

    /**
     * This method reverses every digit in a number
     * @return
     */

    public SumOfEvenDigits reverseNumber() {
            int reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
        return new SumOfEvenDigits(reverse);
    }

    public void printSumOfEvenDigitsReversed() {
        System.out.println("Задача №3.24. Вводится натуральное число. Найти сумму четных цифр, \n"
                + " входящих в его состав. Преобразовать его в другое число, цифры которого будут \n"
                + "следовать в обратном порядке по сравнению с введенным числом.");
        System.out.println("Сумма чётных чисел: " + sumOfEvenDigits().reverseNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfEvenDigits that = (SumOfEvenDigits) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "SumOfEvenDigits{" +
                "number=" + number +
                '}';
    }
}
