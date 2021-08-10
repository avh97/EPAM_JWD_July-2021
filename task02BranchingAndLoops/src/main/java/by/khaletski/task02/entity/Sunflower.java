package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'Sunflower' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class Sunflower {
    private int numberOfPetals;

    static final Logger LOGGER = LogManager.getLogger(Sunflower.class);

    /**
     * This constructor creates a 'Sunflower' object with n number of petals.
     *
     * @param numberOfPetals
     */

    public Sunflower(final int numberOfPetals) {
        if (numberOfPetals < 1) {
            LOGGER.error("Object 'Sunflower' has NOT been created");
            throw new IllegalArgumentException("Number of petals cannot be negative");
        } else {
            this.numberOfPetals = numberOfPetals;
            LOGGER.debug("Object 'Sunflower' has been successfully created");
        }
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }
}
