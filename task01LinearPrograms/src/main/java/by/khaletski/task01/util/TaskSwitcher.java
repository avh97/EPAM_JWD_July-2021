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
                    Task4 task4 = new Task4();
                    task4.valueOfFunction();
                }
                case "9" -> {
                    Task9 task9 = new Task9();
                    task9.valueOfExpression();
                }
                case "19" -> {
                    Task19 task19 = new Task19();
                    task19.propertiesOfTriangle();
                }
                case "24" -> {
                    Task24 task24 = new Task24();
                    task24.propertiesOfTriangle();
                }
                case "34" -> {
                    Task34 task34 = new Task34();
                    task34.solutionOfEquation();
                }
                default -> throw new IllegalStateException("Unexpected value: " + num);
            }
        } while (!ifExit());
        System.out.println("Программа выполнена успешно");
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
