package by.khaletski.task01.entity;

public final class Task34 {

    private Task34() {
    }

    public static void solutionOfEquation() {
        System.out.println("Задача №34. Дано действительное число x. "
                + "Не пользуясь никакими другими арифметическими операциями, "
                + "кроме умножения, сложения и вычитания, "
                + "вычислите за минимальное количество операций "
                + "2*x^4 + 3*x^3 + 4*x^2 - 5*x + 6");
        System.out.println("Введите число x:");
        double x = NumberInput.getNumber();
        System.out.println("Решение: " + (6 + x * (5 + x * (4 + x * (3 + 2 * x)))));
    }
}