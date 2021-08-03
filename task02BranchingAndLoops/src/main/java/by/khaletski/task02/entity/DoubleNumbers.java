package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class DoubleNumbers {
    ArrayList<Double> doubles = new ArrayList<>();

    static final Logger logger = LogManager.getLogger(DoubleNumbers.class);

    public DoubleNumbers(ArrayList<Double> doubles) {
        this.doubles = doubles;
        logger.debug("Object 'DoubleNumbers' has been successfully created");
    }

    public DoubleNumbers(final double newNumA, final double newNumB, final double newNumC) {
        doubles.add(newNumA);
        doubles.add(newNumB);
        doubles.add(newNumC);
        logger.debug("Object 'DoubleNumbers' has been successfully created");
    }

    /**
     * This method receives an ArrayList of doubles and returns the total
     * count of positive doubles in this ArrayList
     */

    public int positiveNumbersCounter() {
        int counter = 0;
        for (int i = 0; i < doubles.size(); i++) {
            if (doubles.get(i) > 0) {
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
