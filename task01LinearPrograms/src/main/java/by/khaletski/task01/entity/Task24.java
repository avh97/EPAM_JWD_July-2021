package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class Task24 {

    public void propertiesOfTriangle() {
        System.out.println("Задача №24. Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c");
        double sideA;
        double sideB;
        double sideC;
        NumberInput numberInput = new NumberInput();
        while (true) {
            System.out.println("Введите значение стороны a треугольника:");
            sideA = numberInput.getPositiveNumber();
            System.out.println("Введите значение стороны b треугольника:");
            sideB = numberInput.getPositiveNumber();
            System.out.println("Введите значение стороны c треугольника:");
            sideC = numberInput.getPositiveNumber();
            if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
                break;
            }
            System.out.println("Такого треугольника не существует. Попробуйте ещё раз.");
        }
        System.out.println("Угол x = " + (Math.acos((sideB * sideB + sideC * sideC - sideA * sideA)
                / (2 * sideB * sideC))) * (180 / Math.PI));
        System.out.println("Угол y = " + (Math.acos((sideA * sideA + sideC * sideC - sideB * sideB)
                / (2 * sideA * sideC))) * (180 / Math.PI));
        System.out.println("Угол z = " + (Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)
                / (2 * sideA * sideB))) * (180 / Math.PI));
    }
}
