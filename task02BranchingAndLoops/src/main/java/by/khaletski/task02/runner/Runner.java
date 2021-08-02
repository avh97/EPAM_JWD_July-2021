package by.khaletski.task02.runner;

import by.khaletski.task02.entity.*;

public class Runner {
    public static void main(String[] args) {
        Comparator comparator = new Comparator(77, 5);
        comparator.printIfNumbersEqual();

        Triangle triangle = new Triangle(1, 1, 1);
        triangle.printIfEquilateralTriangle();

        DoubleNumbers doubleNumbers = new DoubleNumbers(1,2,-7);
        doubleNumbers.printPositiveNumbersCount();

        Petals petals = new Petals(34);
        petals.printIfLoves();

        Buyer buyer = new Buyer(25,170);
        buyer.checkout();

        IntegerNumbers integerNumbers = new IntegerNumbers(0,100);
        integerNumbers.printEvenNumbers();

        IntegerNumbers integerNumbers1 = new IntegerNumbers(0, 7);
        integerNumbers1.printSumOfSquares();




    }
}
