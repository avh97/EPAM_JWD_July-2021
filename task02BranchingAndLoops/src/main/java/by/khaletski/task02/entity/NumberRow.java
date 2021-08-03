package by.khaletski.task02.entity;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberRow {
    private ArrayList<Double> numberRow;
    private double numberE;

    /**
     * Given a number series and some number e.
     * The general term of the series is: a (nth) = 1/2 ^ n + 1/3 ^ n = 1/4 ^ n ...
     * @param sizeOfRow
     * @param givenNumberE
     */

    public NumberRow(final int sizeOfRow, final double givenNumberE) {
        numberE = givenNumberE;
        ArrayList<Double> numbers = new ArrayList<>();
        double denominator = 1;
        int counter = 0;
        while (counter < sizeOfRow) {
            numbers.add(counter, 1 / (denominator * (counter + 1)));
            counter++;
            denominator++;
        }
        numberRow = numbers;
    }

    /**
     * This functions find the sum of those terms of the series whose modulus is greater than or
     * equality to a given e
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