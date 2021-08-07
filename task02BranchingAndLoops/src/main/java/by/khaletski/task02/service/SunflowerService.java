package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class creates 'SunflowerService' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class SunflowerService {
    private int numberOfPetals;

    static final Logger LOGGER = LogManager.getLogger(SunflowerService.class);

    public SunflowerService(final int numberOfPetals) {
        if (numberOfPetals < 1) {
            LOGGER.error("Object 'SunflowerService' has NOT been created");
            throw new IllegalArgumentException("Number of petals cannot be negative");
        } else {
            this.numberOfPetals = numberOfPetals;
            LOGGER.debug("Object 'SunflowerService' has been successfully created");
        }
    }

        /**
         * This method determines the result of divination on a chamomile - "loves - doesn't love",
         * taking as an argument the original given number of petals n.
         * @return true/false
         */

    public boolean ifLoves() {
        return numberOfPetals % 2 != 0;
    }
}
