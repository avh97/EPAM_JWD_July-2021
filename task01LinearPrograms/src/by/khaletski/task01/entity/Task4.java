package by.khaletski.task01.entity;

public final class Task4 {

    private Task4() {
    }

    public static void valueOfFunction() {
        System.out.println("Задача №4. Найдите значение функции z = ((a-3)*b/2)+3");
        System.out.println("Введите число а:");
        double varA = NumberInput.getNumber();
        System.out.println("Введите число b:");
        double varB = NumberInput.getNumber();
        System.out.println("z = " + (((varA - 3) * varB / 2) + 3));
    }
}
