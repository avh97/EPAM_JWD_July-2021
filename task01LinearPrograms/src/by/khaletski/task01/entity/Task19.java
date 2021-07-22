package by.khaletski.task01.entity;

public final class Task19 {

    private Task19() {
    }

    public static void propertiesOfTriangle() {
        System.out.println("Задача №19. Дана сторона равностороннего треугольника. "
                + "Найти площадь этого треугольника, его высоту, "
                + "радиусы вписанной и описанной окружностей.");
        System.out.println("Введите значение стороны треугольника:");
        double sideA = NumberInput.getPositiveNumber();
        System.out.println("Площадь: " + ((Math.sqrt(3) / 4) * sideA * sideA));
        System.out.println("Высота: " + ((Math.sqrt(3) / 2) * sideA));
        System.out.println("Радиус вписанной окружности: " + (sideA / (2 * Math.sqrt(3))));
        System.out.println("Радиус описанной окружности: " + (sideA / (Math.sqrt(3))));
    }
}
