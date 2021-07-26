package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class Task9 {

    private Task9() {
    }

    public static void valueOfExpression() {
        System.out.println("Задача №9. Найдите значение выражения ((a/c) * (b/d)) - ((a*b -c)/c*d)");
        System.out.println("Введите число а:");
        double varA = NumberInput.getNumber();
        System.out.println("Введите число b:");
        double varB = NumberInput.getNumber();
        System.out.println("Введите положительное число c:");
        double varC = NumberInput.getPositiveNumber();
        System.out.println("Введите положительное число d:");
        double varD = NumberInput.getPositiveNumber();
        System.out.println("Ответ: " + (((varA / varC) * (varB / varD)) - ((varA * varB - varC) / varC * varD)));
    }
}
