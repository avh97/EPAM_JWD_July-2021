package by.khaletski.task02.service;

import by.khaletski.task02.entity.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'TriangleService' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class TriangleService {
    private Triangle triangle;

    static final Logger LOGGER = LogManager.getLogger(TriangleService.class);

    public TriangleService(Triangle triangle) {
        this.triangle = triangle;
        LOGGER.debug("Object 'TriangleService' has been successfully created");
    }

    /**
     * This class compares the transmitted values of the sides of a triangle for equality
     * and returns the corresponding boolean value.
     *
     * @return true/false
     */

    public boolean ifEquilateralTriangle() {
        return (triangle.getSideA() == triangle.getSideB()
                && triangle.getSideA() == triangle.getSideC()
                && triangle.getSideB() == triangle.getSideC());
    }
}
