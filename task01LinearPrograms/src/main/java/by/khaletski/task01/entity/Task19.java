package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class Task19 {

    public void propertiesOfTriangle() {
        System.out.println("Задача №19. Дана сторона равностороннего треугольника. "
                + "Найти площадь этого треугольника, его высоту, "
                + "радиусы вписанной и описанной окружностей.");
        System.out.println("Введите значение стороны треугольника:");
        NumberInput numberInput = new NumberInput();
        double sideA = numberInput.getPositiveNumber();
        System.out.println("Площадь: " + ((Math.sqrt(3) / 4) * sideA * sideA));
        System.out.println("Высота: " + ((Math.sqrt(3) / 2) * sideA));
        System.out.println("Радиус вписанной окружности: " + (sideA / (2 * Math.sqrt(3))));
        System.out.println("Радиус описанной окружности: " + (sideA / (Math.sqrt(3))));
    }
}
