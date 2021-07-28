package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class Task19 {

    public Double areaOfEquilateralTriangle() {
        return (Math.sqrt(3) / 4) * getSideA() * getSideA();
    }

    public Double heightOfEquilateralTriangle() {
        return (Math.sqrt(3) / 2) * getSideA();
    }

    public Double radiusOfInscribedCircle() {
        return getSideA() / (2 * Math.sqrt(3));
    }

    public Double radiusOfCircumscribedCircle() {
        return radiusOfInscribedCircle() * 2;
    }

    public double getSideA() {
        System.out.println("Введите значение стороны a треугольника:");
        NumberInput numberInput = new NumberInput();
        return numberInput.getPositiveNumber();
    }

    public void printPropertiesOfTriangle() {
        System.out.println("Задача №19. Дана сторона равностороннего треугольника. "
                + "Найти площадь этого треугольника, его высоту, "
                + "радиусы вписанной и описанной окружностей.");
        System.out.println("Площадь: " + areaOfEquilateralTriangle());
        System.out.println("Высота: " + heightOfEquilateralTriangle());
        System.out.println("Радиус вписанной окружности: " + radiusOfInscribedCircle());
        System.out.println("Радиус описанной окружности: " + radiusOfCircumscribedCircle());
    }
}
