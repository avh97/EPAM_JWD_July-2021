package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * This class is used to create the 'SumOfEvenDigits' objects with properties.
 * @author Anton Khaletski
 * @version 1.0
 */

public class SumOfNDigits {
    private ArrayList<Integer> numbers;

    static final Logger LOGGER = LogManager.getLogger(SumOfNDigits.class);

    /**
     * This constructor creates 'SumOfNDigits' object consisting of numberOfDigits digit numbers
     */

    public SumOfNDigits(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public SumOfNDigits(final int numberOfDigits, final int desiredSumOfDigits) {
        if (numberOfDigits < 1) {
            LOGGER.error("Object 'SumOfNDigits' has not been successfully created");
            throw new IllegalArgumentException("Number of digits must not be less than 1");
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
            LOGGER.debug("Object 'SumOfNDigits' has been successfully created");
        }
    }

    public void printSumOfNDigits() {
        System.out.println("Задача №3.34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.");
        System.out.println("Ответ: " + numbers);
    }

    @Override
    public String toString() {
        return "" + numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfNDigits that = (SumOfNDigits) o;
        return numbers.equals(that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
