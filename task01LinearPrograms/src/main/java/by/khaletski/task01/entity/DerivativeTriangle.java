package by.khaletski.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DerivativeTriangle {
    private double sideA;
    private double sideB;
    private double sideC;

    static final Logger logger = LogManager.getLogger();

    public DerivativeTriangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0
                || sideA + sideB < sideC
                || sideA + sideC < sideB
                || sideB + sideC < sideA) {
            logger.error("Invalid triangle sides. Constructor has not been executed.");
            throw new IllegalArgumentException();
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        logger.info("Constructor has been successfully executed");
    }

    public double getAngleA() {
        return (Math.acos((sideB * sideB + sideC * sideC - sideA * sideA)
                / (2 * sideB * sideC))) * (180 / Math.PI);
    }

    public double getAngleB() {
        return (Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)
                / (2 * sideA * sideB))) * (180 / Math.PI);
    }

    public double getAngleC() {
        return (Math.acos((sideA * sideA + sideC * sideC - sideB * sideB)
                / (2 * sideA * sideC))) * (180 / Math.PI);
    }

    public void printPropertiesOfTriangle() {
        DerivativeTriangle triangle = new DerivativeTriangle(sideA, sideB, sideC);
        System.out.println("Задача №24. Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c");
        System.out.println("Угол A = " + triangle.getAngleA());
        System.out.println("Угол B = " + triangle.getAngleB());
        System.out.println("Угол C = " + triangle.getAngleC());
    }
}
