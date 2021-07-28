package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class EquilateralTriangle {

    public Double area() {
        return (Math.sqrt(3) / 4) * getSideA() * getSideA();
    }

    public Double height() {
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
        System.out.println("Площадь: " + area());
        System.out.println("Высота: " + height());
        System.out.println("Радиус вписанной окружности: " + radiusOfInscribedCircle());
        System.out.println("Радиус описанной окружности: " + radiusOfCircumscribedCircle());
    }
}
