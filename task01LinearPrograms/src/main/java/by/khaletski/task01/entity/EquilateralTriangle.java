package by.khaletski.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EquilateralTriangle {
    private double sideA;

    static final Logger logger = LogManager.getLogger();

    /**
     * Задача №19. Дана сторона равностороннего треугольника. Найти площадь
     * этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
     */

    public EquilateralTriangle(double sideA) {
        if (sideA <= 0) {
            logger.error("Invalid triangle side. Constructor has not been executed.");
            throw new IllegalArgumentException();
        } else {
            this.sideA = sideA;
        }
        logger.info("Constructor has been successfully executed");
    }

    public double area() {
        return (Math.sqrt(3) / 4) * this.sideA * this.sideA;
    }

    public double height() {
        return (Math.sqrt(3) / 2) * this.sideA;
    }

    public double radiusOfInscribedCircle() {
        return sideA / (2 * Math.sqrt(3));
    }

    public double radiusOfCircumscribedCircle() {
        return (sideA / (2 * Math.sqrt(3))) * 2;
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
