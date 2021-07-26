package by.khaletski.task01.util;

import java.util.Scanner;

public final class NumberInput {

    private NumberInput() {
    }

    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        double num;
//        System.out.println("Введите вещественное число");
        while (!sc.hasNextDouble()) {
            System.out.println("Вы не ввели число. Введите вещественное число!");
            sc.next();
        }
        num = sc.nextDouble();
        return num;
    }

    public static double getPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        double num;
        do {
//            System.out.println("Введите положительное число");
            while (!sc.hasNextDouble()) {
                System.out.println("Вы не ввели положительное число. Введите положительное число!");
                sc.next();
            }
            num = sc.nextDouble();
            if (num < 0) {
                System.out.println("Вы не ввели положительное число. Введите положительное число!");
            }
        } while (num < 0);
        return num;
    }
}
