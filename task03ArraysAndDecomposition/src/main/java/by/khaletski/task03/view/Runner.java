package by.khaletski.task03.view;

import by.khaletski.task03.creator.MatrixCreator;
import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.exception.MatrixException;
import by.khaletski.task03.service.MatrixMultiplication;

/**
 * Необходимо написать объектно-ориентированное приложение для работы
 * с одномерными и двумерными массивами (архитектура проекта – послойная архитектура):
 * 1. Определить класс Массив. Создать методы сортировки:
 * ◦ обменная сортировка (метод пузырька);
 * ◦ обменная сортировка «Шейкер-сортировка»,
 * ◦ сортировка посредством выбора (метод простого выбора),
 * ◦ сортировка вставками: метод хеширования (сортировка с вычислением адреса),
 * ◦ сортировка вставками (метод простых вставок),
 * ◦ сортировка бинарного слияния,
 * ◦ сортировка Шелла (сортировка с убывающим шагом).
 * ◦ *внешняя сортировка (сортировка файла БОЛЬШОГО размера, например >2(16)Гб).
 * 2. Определить класс Матрица для решения задач сложения, вычитания, умножения,
 * и других операция с матрицами (см.п .Декомпозиция в книге Блинова).
 */

public class Runner {
    public static void main(String[] args) {
        try {
            MatrixCreator creator = new MatrixCreator();
            Matrix p = new Matrix(2, 3);
            creator.fillRandomized(p, 2, 8);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            creator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is: " + q);
            MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
            Matrix result = matrixMultiplication.multiply(p, q);
            System.out.println("Matrices product is " + result);
        } catch (MatrixException e) {
            System.err.println("Error of creating matrix " + e);
        }
    }
}
