package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class creates 'ComparatorService' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class ComparatorService {
    private double numberA;
    private double numberB;

    static final Logger LOGGER = LogManager.getLogger(ComparatorService.class);

    /**
     * Default constructor creates a 'ComparatorService' object.
     * @param numberA   first number to compare
     * @param numberB   second number to compare
     */

    public ComparatorService(final double numberA, final double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        LOGGER.debug("Object 'ComparatorService' has been successfully created");
    }

    /**
     * This method compares two real numbers and returns the corresponding boolean value.
     * @return true or false
     */

    public boolean ifNumbersEqual() {
        return (numberA == numberB);
    }
}
