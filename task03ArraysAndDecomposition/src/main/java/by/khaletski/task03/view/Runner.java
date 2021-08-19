package by.khaletski.task03.view;

import by.khaletski.task03.controller.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Необходимо написать объектно-ориентированное приложение для работы
 * с одномерными и двумерными массивами (архитектура проекта – послойная архитектура):
 * 1. Определить класс Массив. Создать методы сортировки:
 * + обменная сортировка (метод пузырька);
 * + обменная сортировка «Шейкер-сортировка»,
 * + сортировка посредством выбора (метод простого выбора),
 * ◦ сортировка вставками: метод хеширования (сортировка с вычислением адреса),
 * + сортировка вставками (метод простых вставок),
 * + сортировка бинарного слияния,
 * + сортировка Шелла (сортировка с убывающим шагом).
 * ◦ *внешняя сортировка (сортировка файла БОЛЬШОГО размера, например >2(16)Гб).
 * 2. Определить класс Матрица для решения задач сложения, вычитания, умножения,
 * и других операция с матрицами (см.п .Декомпозиция в книге Блинова).
 */

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.info("Program started.");
        Locale usLocale = new Locale("en", "US");
        Locale ruLocale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("locale_US", ruLocale);


        System.out.println(resourceBundle.getString("start")
                + "MATRICES_ADD\n" + "MATRICES_SUBTRACT\n" + "MATRICES_MULTIPLY\n" + "MATRIX_TRANSPOSE\n"
                + "BUBBLE_SORT\n" + "COCKTAIL_SORT\n" + "SELECTION_SORT\n" + "INSERTION_SORT\n" + "MERGE_SORT\n"
                + "SHELL_SORT");
        Controller controller = new Controller();
        System.out.println(resourceBundle.getString("result") + controller.executeTask(getTask()));
        LOGGER.info("Program executed.");
    }

    public static String getTask() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
