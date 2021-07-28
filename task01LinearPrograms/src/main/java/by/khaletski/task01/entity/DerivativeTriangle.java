package by.khaletski.task01.entity;

import by.khaletski.task01.util.NumberInput;

public final class DerivativeTriangle {

    public double[] getTriangleSides() {
        double[] sides = new double[3];
        NumberInput numberInput = new NumberInput();
        while (true) {
            System.out.println("Введите значение стороны a треугольника:");
            sides[0] = numberInput.getPositiveNumber();
            System.out.println("Введите значение стороны b треугольника:");
            sides[1] = numberInput.getPositiveNumber();
            System.out.println("Введите значение стороны c треугольника:");
            sides[2] = numberInput.getPositiveNumber();
            if (sides[0] + sides[1] > sides[2]
                    && sides[0] + sides[2] > sides[1]
                    && sides[1] + sides[2] > sides[0]) {
                break;
            }
        }
        return sides;
    }

    public double[] getTriangleAngles() {
        double[] angles = new double[3];
        double[] sides = getTriangleSides();
        angles[0] = (Math.acos((sides[1] * sides[1] + sides[2]
                * sides[2] - sides[0] * sides[0])
                / (2 * sides[1] * sides[2]))) * (180 / Math.PI);
        angles[1] = (Math.acos((sides[0] * sides[0] + sides[1]
                * sides[1] - sides[2] * sides[2])
                / (2 * sides[0] * sides[1]))) * (180 / Math.PI);
        angles[2] = (Math.acos((sides[0] * sides[0] + sides[2]
                * sides[2] - sides[1] * sides[1])
                / (2 * sides[0] * sides[2]))) * (180 / Math.PI);
        return angles;
    }

    public void printPropertiesOfTriangle() {
        double[] angles = getTriangleAngles();
        System.out.println("Задача №24. Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c");
        System.out.println("Угол A = " + angles[0]);
        System.out.println("Угол B = " + angles[1]);
        System.out.println("Угол C = " + angles[2]);
    }


}
