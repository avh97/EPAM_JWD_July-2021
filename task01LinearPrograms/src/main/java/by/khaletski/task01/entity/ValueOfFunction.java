package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class ValueOfFunction {

    public Double getValueOfFunction(double varA, double varB) {
        return ((varA - 3) * varB / 2) + 3;
    }

    public Double getValueOfFunction() {
        System.out.println("Введите число а:");
        NumberInput numberInput = new NumberInput();
        double varA = numberInput.getNumber();
        System.out.println("Введите число b:");
        double varB = numberInput.getNumber();
        return ((varA - 3) * varB / 2) + 3;
    }

    public void printValueOfFunction() {
        System.out.println("Задача №4. Найдите значение функции z = ((a-3)*b/2)+3");
        System.out.println(("z = " + getValueOfFunction()));
    }
}
