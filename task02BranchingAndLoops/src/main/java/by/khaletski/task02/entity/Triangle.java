package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'Triangle' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    static final Logger LOGGER = LogManager.getLogger(Triangle.class);

    /**
     * Default constructor creates the 'Triangle' object and check it for validity.
     *
     * @param sideA side A of the triangle
     * @param sideB side B of the triangle
     * @param sideC side C of the triangle
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

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
