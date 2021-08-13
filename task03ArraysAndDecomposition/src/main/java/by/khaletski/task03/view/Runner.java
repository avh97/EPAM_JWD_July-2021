package by.khaletski.task03.view;

import by.khaletski.task03.controller.Controller;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.entity.exception.NumberArrayException;

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
 * ◦ сортировка Шелла (сортировка с убывающим шагом).
 * ◦ *внешняя сортировка (сортировка файла БОЛЬШОГО размера, например >2(16)Гб).
 * 2. Определить класс Матрица для решения задач сложения, вычитания, умножения,
 * и других операция с матрицами (см.п .Декомпозиция в книге Блинова).                      +
 */

public class Runner {
    public static void main(String[] args) throws MatrixException, NumberArrayException {
        Controller controller = new Controller();
        System.out.println(controller.executeTask("MATRICES_MULTIPLY"));

//        ControllerOld controllerOld = new ControllerOld();
//        controllerOld.executeTask("SORT_SHAKER");

//        NumberArray array = new NumberArray(new int[]{1, 10, 5, 2, 10, 5});
//        ServiceFactory.getInstance().getBubbleSortingService().bubbleSort(array);
//        System.out.println(array);

//        try {
//            Matrix p = new Matrix(4,4);
//            Matrix q = new Matrix(2,2);
//            ServiceFactory.getInstance().getMatrixFillService().fillRandomized(p, 1, 10);
//            ServiceFactory.getInstance().getMatrixFillService().fillRandomized(q, 11, 20);
//            System.out.println("First matrix is: " + p);
//            System.out.println("Second matrix is: " + q);
//            System.out.println("Matrices product is: " +
//                    ServiceFactory.getInstance().getMatrixTransposeService().transpose(p));
//        } catch (MatrixException e) {
//            e.printStackTrace();
//        }



//        try {
//            MatrixFillService creator = new MatrixFillService();
//            Matrix p = new Matrix(2, 3);
//            creator.fillRandomized(p, 2, 8);
//            System.out.println("Matrix first is: " + p);
//            Matrix q = new Matrix(3, 4);
//            creator.fillRandomized(q, 2, 7);
//            System.out.println("Matrix second is: " + q);
//            MatrixMultiplicationService matrixMultiplicationService = new MatrixMultiplicationService();
//            Matrix result = matrixMultiplicationService.multiply(p, q);
//            System.out.println("Matrices product is " + result);
//        } catch (MatrixException e) {
//            System.err.println("Error of creating matrix " + e);
//        }
    }
}
