package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class is used to create the 'Triangle' objects with properties
 @author Anton Khaletski
 @version 1.0
 */

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    static final Logger LOGGER = LogManager.getLogger(Triangle.class);

    /**
     * Default constructor creates the 'Triangle' object and check it for validity
     * @param sideA  side A of a triangle
     * @param sideB  side B of a triangle
     * @param sideC  side C of a triangle
     */

    public Triangle(final double sideA, final double sideB, final double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0
                || sideA + sideB < sideC
                || sideA + sideC < sideB
                || sideB + sideC < sideA) {
            LOGGER.error("Invalid triangle sides. Object 'Triangle' has not been created");
            throw new IllegalArgumentException();
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        LOGGER.debug("Object 'Triangle' has been successfully created");
    }

    /**
     * This class compares the transmitted values of the sides of a triangle for equilateralism
     * and returns the corresponding boolean value.
     * @return
     */

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
