package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class Task9 {

    public Double valueOfExpression() {
        System.out.println("Введите число а:");
        NumberInput numberInput = new NumberInput();
        double varA = numberInput.getNumber();
        System.out.println("Введите число b:");
        double varB = numberInput.getNumber();
        System.out.println("Введите положительное число c:");
        double varC = numberInput.getPositiveNumber();
        System.out.println("Введите положительное число d:");
        double varD = numberInput.getPositiveNumber();
        return ((varA / varC) * (varB / varD)) - ((varA * varB - varC) / varC * varD);
    }

    public void printValueOfExpression() {
        System.out.println("Задача №9. Найдите значение выражения ((a/c) * (b/d)) - ((a*b -c)/c*d)");
        System.out.println("Значение выражения: " + valueOfExpression());
    }
}
