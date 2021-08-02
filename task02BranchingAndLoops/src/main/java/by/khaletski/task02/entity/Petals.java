package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Petals {
    private int numberOfPetals;

    static final Logger logger = LogManager.getLogger(Petals.class);

    public Petals(int numberOfPetals) {
        if (numberOfPetals < 1) {
            throw new IllegalArgumentException();
        } else {
            this.numberOfPetals = numberOfPetals;
            logger.debug("Object 'Petals' has been successfully created");
        }
    }

        /**
         * This method determines the result of divination on a chamomile -
         * "loves - doesn't love", taking as an argument the original
         * given number of petals n.
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
