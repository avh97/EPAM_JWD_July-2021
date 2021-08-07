package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class creates 'TriangleService' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class TriangleService {
    private double sideA;
    private double sideB;
    private double sideC;

    static final Logger LOGGER = LogManager.getLogger(TriangleService.class);

    /**
     * Default constructor creates the 'Triangle' object and check it for validity.
     * @param sideA side A of the triangle
     * @param sideB side B of the triangle
     * @param sideC side C of the triangle
     */

    public TriangleService(final double sideA, final double sideB, final double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0
                || sideA + sideB < sideC
                || sideA + sideC < sideB
                || sideB + sideC < sideA) {
            LOGGER.error("Invalid triangle sides. Object 'TriangleService' has not been created");
            throw new IllegalArgumentException();
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        LOGGER.debug("Object 'TriangleService' has been successfully created");
    }

    /**
     * This class compares the transmitted values of the sides of a triangle for equality
     * and returns the corresponding boolean value.
     * @return true/false
     */

    public boolean ifEquilateralTriangle() {
        return (sideA == sideB && sideA == sideC && sideB == sideC);
    }
}
