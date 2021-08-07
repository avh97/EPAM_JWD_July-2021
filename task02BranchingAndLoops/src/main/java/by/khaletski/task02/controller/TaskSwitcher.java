package by.khaletski.task02.controller;

import by.khaletski.task02.service.*;

import java.util.Scanner;

/** This class is used to switch between different services and execute selected one.
 @author Anton Khaletski
 @version 1.0
 */

public class TaskSwitcher {
    public void taskSwitcher(String string) {
        switch (string) {
            case "2.4":
                ComparatorService comparatorService = new ComparatorService(getDouble(), getDouble());
                System.out.println(comparatorService.ifNumbersEqual());
                break;
            case "2.9":
                TriangleService triangleService = new TriangleService(getDouble(), getDouble(), getDouble());
                System.out.println(triangleService.ifEquilateralTriangle());
                break;
            case "2.19":
                CountOfNumbersService countOfNumbersService =
                        new CountOfNumbersService(getDouble(), getDouble(), getDouble());
                System.out.println(countOfNumbersService.positiveNumbersCounter());
                break;
            case "2.24":
                SunflowerService sunflowerService = new SunflowerService(getInt());
                System.out.println(sunflowerService.ifLoves());
                break;
            case "2.34":
                BuyerService buyerService = new BuyerService(getDouble(), getDouble());
                System.out.println(buyerService.checkout());
                break;
            case "3.4":
                EvenNumbersService evenNumbersService = new EvenNumbersService(getInt(), getInt());
                System.out.println(evenNumbersService.getNumbers());
                break;
            case "3.9":
                SumOfNumberSquaresService sumOfNumberSquaresService =
                        new SumOfNumberSquaresService(getInt(), getInt());
                System.out.println(sumOfNumberSquaresService.getNumbers());
                break;
            case "3.19":
                NumericRowService numericRowService = new NumericRowService(getInt(), getDouble());
                System.out.println(numericRowService.getNumericRow());
                break;
            case "3.24":
                SumOfEvenDigitsService sumOfEvenDigitsService = new SumOfEvenDigitsService(getInt());
                System.out.println(sumOfEvenDigitsService.getNumber());
                break;
            case "3.34":
                SumOfNDigitsService sumOfNDigitsService =
                        new SumOfNDigitsService(getInt(), getInt());
                System.out.println(sumOfNDigitsService.getNumbers());
                break;
        }
    }

    private int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private double getDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
