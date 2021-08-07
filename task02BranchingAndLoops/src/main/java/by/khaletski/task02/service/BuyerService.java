package by.khaletski.task02.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class creates 'BuyerService' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class BuyerService {
    private double cash;
    private double price;

    static final Logger LOGGER = LogManager.getLogger(BuyerService.class);

    /**
     * Default constructor creates a 'BuyerService' object.
     * @param cash  cash available from the buyer
     * @param price price of a purchase
     */

    public BuyerService(final double cash, final double price) {
        if (cash < 0 || price < 0) {
            LOGGER.error("Object 'BuyerService' has NOT been created");
            throw new IllegalArgumentException("Cash available or price of a purchase cannot be negative");
        } else {
            this.cash = cash;
            this.price = price;
            LOGGER.debug("Object 'BuyerService' has been successfully created");
        }
    }

    /**
     * This method shows an episode of using a computer in a bookstore.
     * Computer asks for the cost of books, the amount of money contributed by the buyer;
     * - if no change is required, prints on the screen "thanks";
     * - if more money is deposited than necessary, then it prints “take change” and indicates the amount of change;
     * - if there is not enough money, then prints a message about it and indicates the amount of the missing amount.
     * @return  response to user
     */

    public String checkout() {
        System.out.println("Cash available: " + cash + " USD");
        System.out.println("Total cost: " + price + " USD");
        if (cash > price) {
            return "Here's your change: " + (cash - price) + " USD. " + "Thank you for the purchase!";
        }
        if (cash < price) {
            return "You don't have enough: " + (price - cash) + " USD.";
        } else {
            return "Thank you for no change. All the best!";
        }
    }
}
