package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class SolutionOfEquation {

    public double solutionOfEquation(double x) {
        return (6 + x * (5 + x * (4 + x * (3 + 2 * x))));
    }

    public double solutionOfEquation() {
        System.out.println("Введите число x:");
        NumberInput numberInput = new NumberInput();
        double x = numberInput.getPositiveNumber();
        return (6 + x * (5 + x * (4 + x * (3 + 2 * x))));
    }

    public void printSolutionOfEquation() {
        System.out.println("Задача №34. Дано действительное число x. "
                + "Не пользуясь никакими другими арифметическими операциями, "
                + "кроме умножения, сложения и вычитания, "
                + "вычислите за минимальное количество операций "
                + "2*x^4 + 3*x^3 + 4*x^2 - 5*x + 6");
        System.out.println("Решение: " + solutionOfEquation());
    }
}
