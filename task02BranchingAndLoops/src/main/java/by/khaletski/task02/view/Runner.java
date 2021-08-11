package by.khaletski.task02.view;

import by.khaletski.task02.controller.TaskSwitcher;

import java.util.Locale;
import java.util.ResourceBundle;

public class Runner {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        Locale ruLocale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("locale_RU", ruLocale);

        TaskSwitcher taskSwitcher = new TaskSwitcher();
        taskSwitcher.taskSwitcher(resourceBundle);
    }
}
