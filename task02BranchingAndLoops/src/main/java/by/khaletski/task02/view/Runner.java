package by.khaletski.task02.view;

import by.khaletski.task02.controller.TaskSwitcher;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        Locale ruLocale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("locale_RU", ruLocale);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(resourceBundle.getString("enter"));
            TaskSwitcher taskSwitcher = new TaskSwitcher();
            String task = scanner.nextLine();
            switch (task) {
                case "2.4":
                    System.out.println(resourceBundle.getString("task2_4"));
                    break;
                case "2.9":
                    System.out.println(resourceBundle.getString("task2_9"));
                    break;
                case "2.19":
                    System.out.println(resourceBundle.getString("task2_19"));
                    break;
                case "2.24":
                    System.out.println(resourceBundle.getString("task2_24"));
                    break;
                case "2.34":
                    System.out.println(resourceBundle.getString("task2_34"));
                    break;
                case "3.4":
                    System.out.println(resourceBundle.getString("task3_4"));
                    break;
                case "3.9":
                    System.out.println(resourceBundle.getString("task3_9"));
                    break;
                case "3.19":
                    System.out.println(resourceBundle.getString("task3_19"));
                    break;
                case "3.24":
                    System.out.println(resourceBundle.getString("task3_24"));
                    break;
                case "3.34":
                    System.out.println(resourceBundle.getString("task3_34"));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + task);
            }
            taskSwitcher.taskSwitcher(task);
            System.out.println(resourceBundle.getString("exit"));
        } while (!scanner.nextLine().equals("exit"));
    }
}
