package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'Buyer' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class Buyer {
    private double cash;
    private double price;

    static final Logger LOGGER = LogManager.getLogger(Buyer.class);

    /**
     * Default constructor creates a 'Buyer' object.
     *
     * @param cash  cash available from the buyer
     * @param price price of a purchase
     */

    public Buyer(final double cash, final double price) {
        if (cash < 0 || price < 0) {
            LOGGER.error("Object 'Buyer' has NOT been created");
            throw new IllegalArgumentException("Cash available or price of a purchase cannot be negative");
        } else {
            this.cash = cash;
            this.price = price;
            LOGGER.debug("Object 'Buyer' has been successfully created");
        }
    }

    public double getCash() {
        return cash;
    }

    public double getPrice() {
        return price;
    }
}
