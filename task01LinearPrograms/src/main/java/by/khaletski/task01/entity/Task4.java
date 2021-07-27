package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class Task4 {

    public void valueOfFunction() {
        System.out.println("Задача №4. Найдите значение функции z = ((a-3)*b/2)+3");
        System.out.println("Введите число а:");
        NumberInput numberInput = new NumberInput();
        double varA = numberInput.getNumber();
        System.out.println("Введите число b:");
        double varB = numberInput.getNumber();
        System.out.println("z = " + (((varA - 3) * varB / 2) + 3));
    }
}
