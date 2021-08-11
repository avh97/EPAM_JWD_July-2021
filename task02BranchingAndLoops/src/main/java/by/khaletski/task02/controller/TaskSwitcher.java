package by.khaletski.task02.controller;

import by.khaletski.task02.entity.Buyer;
import by.khaletski.task02.entity.Sunflower;
import by.khaletski.task02.entity.Triangle;
import by.khaletski.task02.service.*;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * This class is used to switch between different services and execute selected one.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class TaskSwitcher {
    public void taskSwitcher(ResourceBundle resourceBundle) {
        System.out.println(resourceBundle.getString("enter"));
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        do {
            switch (task) {
                case "2.4":
                    System.out.println(resourceBundle.getString("task2_4"));
                    ComparatorService comparatorService = new ComparatorService(getDouble(), getDouble());
                    System.out.println(comparatorService.ifNumbersEqual());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "2.9":
                    System.out.println(resourceBundle.getString("task2_9"));
                    TriangleService triangleService = new TriangleService(
                            new Triangle(getDouble(), getDouble(), getDouble()));
                    System.out.println(triangleService.ifEquilateralTriangle());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "2.19":
                    System.out.println(resourceBundle.getString("task2_19"));
                    CountOfNumbersService countOfNumbersService =
                            new CountOfNumbersService(getDouble(), getDouble(), getDouble());
                    System.out.println(countOfNumbersService.positiveNumbersCounter());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "2.24":
                    System.out.println(resourceBundle.getString("task2_24"));
                    SunflowerService sunflowerService = new SunflowerService(new Sunflower(getInt()));
                    System.out.println(sunflowerService.ifLoves());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "2.34":
                    System.out.println(resourceBundle.getString("task2_34"));
                    BuyerService buyerService = new BuyerService(new Buyer(getDouble(), getDouble()));
                    System.out.println(buyerService.checkout());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "3.4":
                    System.out.println(resourceBundle.getString("task3_4"));
                    EvenNumbersService evenNumbersService = new EvenNumbersService(getInt(), getInt());
                    System.out.println(evenNumbersService.getNumbers());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "3.9":
                    System.out.println(resourceBundle.getString("task3_9"));
                    SumOfNumberSquaresService sumOfNumberSquaresService =
                            new SumOfNumberSquaresService(getInt(), getInt());
                    System.out.println(sumOfNumberSquaresService.sumOfSquares());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "3.19":
                    System.out.println(resourceBundle.getString("task3_19"));
                    NumericRowService numericRowService = new NumericRowService(getInt(), getDouble());
                    System.out.println(numericRowService.getNumericRow());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "3.24":
                    System.out.println(resourceBundle.getString("task3_24"));
                    SumOfEvenDigitsService sumOfEvenDigitsService = new SumOfEvenDigitsService(getInt());
                    System.out.println(sumOfEvenDigitsService.getNumber());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                case "3.34":
                    System.out.println(resourceBundle.getString("task3_34"));
                    SumOfNDigitsService sumOfNDigitsService =
                            new SumOfNDigitsService(getInt(), getInt());
                    System.out.println(sumOfNDigitsService.getNumbers());
                    System.out.println(resourceBundle.getString("exit"));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + task);
            }

        } while (!scanner.nextLine().equals("exit"));
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
