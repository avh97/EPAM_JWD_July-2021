package by.khaletski.task02.runner;

import by.khaletski.task02.entity.*;

public class Runner {
    public static void main(String[] args) {
        //задача 2.4
        Comparator comparator = new Comparator(77, 5);
        comparator.printIfNumbersEqual();

        //задача 2.9
        Triangle triangle = new Triangle(1, 1, 1);
        triangle.printIfEquilateralTriangle();

        //задача 2.19
        CountOfNumbers countOfNumbers = new CountOfNumbers(1,2,-7);
        countOfNumbers.printPositiveNumbersCount();

        //задача 2.24
        Sunflower sunflower = new Sunflower(34);
        sunflower.printIfLoves();

        //задача 2.34
        Buyer buyer = new Buyer(25,170);
        buyer.checkout();

        //задача 3.4
        EvenNumbers evenNumbers = new EvenNumbers(0,100);
        evenNumbers.printEvenNumbers();

        //задача 3.9
        SumOfNumberSquares sumOfNumberSquares = new SumOfNumberSquares(0, 7);
        sumOfNumberSquares.printSumOfSquares();

        //задача 3.19
        NumberRow numberRow = new NumberRow(20,0.05);
        numberRow.printSumOfNumbers();

        //задача 3.24
        SumOfEvenDigits sumOfEvenDigits = new SumOfEvenDigits(12647245);
        sumOfEvenDigits.printSumOfEvenDigitsReversed();

        //задача 3.34
        SumOfNDigits sumOfNDigits = new SumOfNDigits(4, 15);
        sumOfNDigits.printSumOfNDigits();
    }
}
