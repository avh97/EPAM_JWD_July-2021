package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerNumbers {
    private ArrayList<Integer> numbers;

    static final Logger logger = LogManager.getLogger(IntegerNumbers.class);

    public IntegerNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
        logger.debug("Object 'IntegerNumbers' has been successfully created");
    }

    public IntegerNumbers(int startValue, int endValue) {
        ArrayList<Integer> all = new ArrayList<>(Math.abs(startValue - endValue));
        for (int i = startValue; i <= endValue; i++) {
            all.add(i);
        }
        this.numbers = all;
        logger.debug("Object 'DoubleNumbers' has been successfully created");
    }

    /**
     * The method returns all even numbers in the range 2 to 100 inclusive
     * from the given ArrayList
     */

    public ArrayList<Integer> evenNumbers() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0 || number == 0) {
                iterator.remove();
            }
        }
        return numbers;
    }

    /**
     * This method finds the sum of squares of the elements
     * from the given ArrayList
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

    public void printEvenNumbers() {
        System.out.println("Задача №3.4. С помощью оператора while напишите программу\n" +
                "вывода всех четных чисел в диапазоне включительно.");
        System.out.println("Чётные числа в заданном диапазоне: " + evenNumbers());
    }

    public void printSumOfSquares() {
        System.out.println("Задача №3.9. Найти сумму квадратов чисел.");
        System.out.println("Сумма квадратов: " + sumOfSquares());
    }
}
