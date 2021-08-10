package by.khaletski.task02.service;

import by.khaletski.task02.entity.Sunflower;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'SunflowerService' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class SunflowerService {
    private Sunflower sunflower;

    static final Logger LOGGER = LogManager.getLogger(SunflowerService.class);

    public SunflowerService(Sunflower sunflower) {
        this.sunflower = sunflower;
        LOGGER.debug("Object 'SunflowerService' has been successfully created");
    }

    /**
     * This method determines the result of divination on a chamomile - "loves - doesn't love",
     * taking as an argument the original given number of petals n.
     *
     * @return true/false
     */

    public boolean ifLoves() {
        return sunflower.getNumberOfPetals() % 2 != 0;
    }
}
