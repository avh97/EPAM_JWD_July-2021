package by.khaletski.task02.service;

import by.khaletski.task02.entity.Buyer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates 'BuyerService' objects with properties.
 *
 * @author Anton Khaletski
 * @version 1.0
 */

public class BuyerService {
    private Buyer buyer;

    public BuyerService(Buyer buyer) {
        this.buyer = buyer;
        LOGGER.debug("Object 'BuyerService' has been successfully created");
    }

    static final Logger LOGGER = LogManager.getLogger(BuyerService.class);

    /**
     * This method shows an episode of using a computer in a bookstore.
     * Computer asks for the cost of books, the amount of money contributed by the buyer;
     * - if no change is required, prints on the screen "thanks";
     * - if more money is deposited than necessary, then it prints “take change” and indicates the amount of change;
     * - if there is not enough money, then prints a message about it and indicates the amount of the missing amount.
     *
     * @return response to user
     */

    public String checkout() {
        System.out.println("Cash available: " + buyer.getCash() + " USD");
        System.out.println("Total cost: " + buyer.getPrice() + " USD");
        if (buyer.getCash() > buyer.getPrice()) {
            return "Here's your change: " + (buyer.getCash() - buyer.getPrice())
                    + " USD. " + "Thank you for the purchase!";
        }
        if (buyer.getCash() < buyer.getPrice()) {
            return "You don't have enough: " + (buyer.getPrice() - buyer.getCash()) + " USD.";
        } else {
            return "Thank you for no change. All the best!";
        }
    }

    public Buyer getBuyer() {
        return buyer;
    }
}
