package by.khaletski.task01.util;

import by.khaletski.task01.entity.*;

import java.util.Scanner;

public final class TaskSwitcher {
    public void startApplication() {
        do {
            System.out.println("Введите номер задачи: 4, 9, 19, 24 или 34");
            String num = getTaskNumber();
            switch (num) {
                case "4" -> {
                    ValueOfFunction task4 = new ValueOfFunction();
                    task4.printValueOfFunction();
                }
                case "9" -> {
                    ValueOfExpression task9 = new ValueOfExpression();
                    task9.printValueOfExpression();
                }
                case "19" -> {
                    EquilateralTriangle task19 = new EquilateralTriangle();
                    task19.printPropertiesOfTriangle();
                }
                case "24" -> {
                    DerivativeTriangle task24 = new DerivativeTriangle();
                    task24.printPropertiesOfTriangle();
                }
                case "34" -> {
                    SolutionOfEquation task34 = new SolutionOfEquation();
                    task34.printSolutionOfEquation();
                }
                default -> throw new IllegalStateException("Unexpected value: " + num);
            }
        } while (!ifExit());
    }

    private String getTaskNumber() {
        Scanner scan = new Scanner(System.in);
        String num;
        boolean isValid;
        do {
            num = scan.nextLine();
            if (!num.equals("4") && !num.equals("9")
                    && !num.equals("19")
                    && !num.equals("24")
                    && !num.equals("34")) {
                System.out.println("Итак, ещё раз: введите номер задачи: 4, 9, 19, 24 или 34");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);
        return num;
    }

    private boolean ifExit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для продолжения выполнения программы введите любой символ. "
                + "Для выхода из программы введите exit.");
        return scan.nextLine().equals("exit");
    }
}
