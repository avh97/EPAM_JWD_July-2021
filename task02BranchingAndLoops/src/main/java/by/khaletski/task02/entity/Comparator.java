package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class is used to create the 'Comparator' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class Comparator {
    private double numberA;
    private double numberB;

    static final Logger LOGGER = LogManager.getLogger(Comparator.class);

    /**
     * Default constructor creates a 'Comparator' object.
     * @param numberA   first number to compare
     * @param numberB   second number to compare
     */

    public Comparator(final double numberA, final double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        LOGGER.debug("Object 'Comparator' has been successfully created");
    }

    /**
     * This method compares two real numbers and returns the corresponding boolean value
     * @return true or false.
     */

    public boolean ifNumbersEqual() {
        return (numberA == numberB);
    }

    public void printIfNumbersEqual() {
        System.out.println("Задача №2.4. Составить программу: равны ли два числа а и b?");
        if (ifNumbersEqual()) {
            System.out.println("Число " + numberA + " равно числу " + numberB);
        } else {
            System.out.println("Число " + numberA + " не равно числу " + numberB);
        }
    }
}
