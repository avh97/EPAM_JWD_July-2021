package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class compares the transmitted values of the sides of a triangle for equilateralism
 * and returns the corresponding boolean value.
 */

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    static final Logger logger = LogManager.getLogger(Triangle.class);

    public Triangle(final double newSideA, final double newSideB, final double newSideC) {
        if (newSideA <= 0 || newSideB <= 0 || newSideC <= 0
                || newSideA + newSideB < newSideC
                || newSideA + newSideC < newSideB
                || newSideB + newSideC < newSideA) {
            logger.error("Invalid triangle sides. Object 'Triangle' has not been created");
            throw new IllegalArgumentException();
        } else {
            sideA = newSideA;
            sideB = newSideB;
            sideC = newSideC;
        }
        logger.debug("Object 'Triangle' has been successfully created");
    }

    public boolean ifEquilateralTriangle() {
        return (sideA == sideB && sideA == sideC && sideB == sideC);
    }

    public void printIfEquilateralTriangle() {
        System.out.printf("Задача №2.9. Составить программу, которая определит по трем введенным сторонам, \n" +
                "является ли данный треугольник 'равносторонним'.");
        if (ifEquilateralTriangle()) {
            System.out.println("Треугольник является равносторонним");
        } else {
            System.out.println("Треугольник не является равносторонним");
        }
    }

}
