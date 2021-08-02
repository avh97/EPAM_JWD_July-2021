package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Comparator {
    private double numA;
    private double numB;

    static final Logger logger = LogManager.getLogger(Comparator.class);

    public Comparator(double newNumA, double newNumB) {
        numA = newNumA;
        numB = newNumB;
        logger.debug("Object 'Comparator' has been successfully created");
    }

    /**
     *  This method compares two real doubles and returns the corresponding boolean value
     */

    public boolean ifNumbersEqual() {
        return (numA == numB);
    }

    public void printIfNumbersEqual() {
        System.out.println("Задача №2.4. Составить программу: равны ли два числа а и b?");
        if (ifNumbersEqual()) {
            System.out.println("Число " + numA + " равно числу " + numB);
        } else {
            System.out.println("Число " + numA + " не равно числу " + numB);
        }
    }
}
