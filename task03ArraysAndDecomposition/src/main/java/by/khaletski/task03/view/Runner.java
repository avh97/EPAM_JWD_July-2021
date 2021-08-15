package by.khaletski.task03.view;

import by.khaletski.task03.controller.Controller;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.entity.exception.NumberArrayException;

import java.util.Scanner;

/**
 * Необходимо написать объектно-ориентированное приложение для работы
 * с одномерными и двумерными массивами (архитектура проекта – послойная архитектура):
 * 1. Определить класс Массив. Создать методы сортировки:
 * ◦ обменная сортировка (метод пузырька);                                                  +
 * ◦ обменная сортировка «Шейкер-сортировка»,                                               +
 * ◦ сортировка посредством выбора (метод простого выбора),                                 +
 * ◦ сортировка вставками: метод хеширования (сортировка с вычислением адреса),
 * ◦ сортировка вставками (метод простых вставок),                                          +
 * ◦ сортировка бинарного слияния,
 * ◦ сортировка Шелла (сортировка с убывающим шагом).                                       +
 * ◦ *внешняя сортировка (сортировка файла БОЛЬШОГО размера, например >2(16)Гб).
 * 2. Определить класс Матрица для решения задач сложения, вычитания, умножения,
 * и других операция с матрицами (см.п .Декомпозиция в книге Блинова).                      +
 */

public class Runner {
    public static void main(String[] args) throws MatrixException, NumberArrayException {
        System.out.println("Список команд: \n" +
                "MATRICES_ADD\n" +
                "MATRICES_SUBTRACT\n" +
                "MATRICES_MULTIPLY\n" +
                "MATRIX_TRANSPOSE\n" +
                "BUBBLE_SORT\n" +
                "SHAKER_SORT\n" +
                "SELECTION_SORT\n" +
                "INSERTION_SORT\n" +
                "MERGE_SORT\n" +
                "SHELL_SORT\n" +
                "WRONG_REQUEST\n");
        Controller controller = new Controller();
        System.out.println(controller.executeTask(getMenuName()));
    }

    public static String getMenuName() {
        System.out.println("Выберите команду: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
