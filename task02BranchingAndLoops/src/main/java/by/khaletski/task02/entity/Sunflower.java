package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class is used to create the 'Sunflower' objects with properties
 @author Anton Khaletski
 @version 1.0
 */

public class Sunflower {
    private int numberOfPetals;

    /**
     * Given a number series and some number e.
     * The general term of the series is: a (n-th) = 1/2 ^ n + 1/3 ^ n = 1/4 ^ n ...
     * @param sizeOfRow
     * @param givenNumberE
     */

    static final Logger LOGGER = LogManager.getLogger(Sunflower.class);

    public Sunflower(final int numberOfPetals) {
        if (numberOfPetals < 1) {
            LOGGER.error("Object 'Sunflower' has NOT been created");
            throw new IllegalArgumentException("Number of petals cannot be negative");
        } else {
            this.numberOfPetals = numberOfPetals;
            LOGGER.debug("Object 'Sunflower' has been successfully created");
        }
    }

        /**
         * This method determines the result of divination on a chamomile -
         * "loves - doesn't love", taking as an argument the original
         * given number of petals n.
         * @return
         */

    public boolean ifLoves() {
        if (numberOfPetals % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void printIfLoves() {
        System.out.println("Задача №2.24. Составить программу, " +
                "определяющую результат гадания на ромашке — «любит — не любит»,\n" +
                " взяв за исходное данное количество лепестков n");
        System.out.println("Ответ: " + ifLoves());
    }
}
