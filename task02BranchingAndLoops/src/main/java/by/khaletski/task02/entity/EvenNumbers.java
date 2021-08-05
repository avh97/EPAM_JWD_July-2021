package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/** This class is used to create the 'EvenNumbers' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class EvenNumbers {
    private ArrayList<Integer> numbers;

    static final Logger LOGGER = LogManager.getLogger(EvenNumbers.class);

    /**
     * Default constructor creates and 'EvenNumbers' object,
     * @param numbers   ArrayList of doubles
     */

    public EvenNumbers(final ArrayList<Integer> numbers) {
        this.numbers = numbers;
        LOGGER.debug("Object 'EvenNumbers' has been successfully created");
    }

    /**
     * This constructor creates an 'EvenNumbers' object consisting of numbers
     * in the range between two numbers,
     * @param startValue
     * @param extremeValue
     */

    public EvenNumbers(final int startValue, final int extremeValue) {
        ArrayList<Integer> all = new ArrayList<>(Math.abs(startValue - extremeValue));
        for (int i = startValue; i <= extremeValue; i++) {
            all.add(i);
        }
        this.numbers = all;
        LOGGER.debug("Object 'EvenNumbers' has been successfully created");
    }

    /**
     * This method returns all even numbers in the range 2 to 100 inclusive
     * from the given EvenNumbers,
     * @return
     */

    public EvenNumbers evenNumbersList() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0 || number == 0) {
                iterator.remove();
            }
        }
        return new EvenNumbers(numbers);
    }

    public void printEvenNumbers() {
        System.out.println("Задача №3.4. С помощью оператора while напишите программу \n" +
                "вывода всех четных чисел в диапазоне включительно.");
        System.out.println("Чётные числа в заданном диапазоне: " + evenNumbersList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenNumbers that = (EvenNumbers) o;
        return numbers.equals(that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
