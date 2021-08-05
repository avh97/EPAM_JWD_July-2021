package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

/** This class is used to create the 'NumberRow' objects with properties
 @author Anton Khaletski
 @version 1.0
 */

public class NumberRow {
    private ArrayList<Double> numberRow;
    private int sizeOfRow;
    private double numberE;

    static final Logger LOGGER = LogManager.getLogger(NumberRow.class);

    /**
     * Default constructor creates a 'NumberRow' object, which creates a number series.
     * The general term of the series is: a (n-th) = 1/2 ^ n + 1/3 ^ n = 1/4 ^ n ...
     * @param sizeOfRow
     * @param numberE
     */

    public NumberRow(final int sizeOfRow, final double numberE) {
        if (sizeOfRow < 0) {
            LOGGER.error("Object 'NumberRow' has not been successfully created");
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
            numberRow = numbers;
        }
        LOGGER.debug("Object 'NumberRow' has been successfully created");
    }

    /**
     * This function finds the sum of those numbers in NumberRow,
     * whose modulus is greater than or equal to a given e
     * @return
     */

    public double sumOfNumbers() {
        Iterator<Double> iterator = numberRow.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            if (Math.abs(iterator.next()) >= numberE) {
                sum = sum + iterator.next();
            }
        }
        return sum;
    }

    public void printSumOfNumbers() {
        System.out.println("Задача 3.19. Даны числовой ряд и некоторое число е. \n"
                + "Найти сумму тех членов ряда, модуль которых больше или равен заданному е. \n"
                + "Общий член ряда имеет вид: a (n-ное) = 1/2^n + 1/3^n ...");
        System.out.println("Сумма членов ряда: " + sumOfNumbers());
    }
}
