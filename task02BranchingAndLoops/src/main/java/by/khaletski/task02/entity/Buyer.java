package by.khaletski.task02.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class is used to store the 'Buyer' objects with properties.
 @author Anton Khaletski
 @version 1.0
 */

public class Buyer {
    private double cash;
    private double price;

    static final Logger LOGGER = LogManager.getLogger(Buyer.class);

    /**
     * Default constructor creates a 'Buyer' object.
     * @param cash   cash available from the buyer
     * @param price  price of a purchase
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

    /**
     * This method shows an episode of using a computer in a bookstore.
     * Computer asks for the cost of books, the amount of money contributed by the buyer;
     * if no change is required, prints on the screen "thanks";
     * if more money is deposited than necessary, then it prints “take change” and indicates the amount of change;
     * if there is not enough money, then prints a message about it and indicates the amount of the missing amount.
     * @return
     */

    public String checkout() {
        System.out.println("Задача №2.34. Составить программу, реализующую эпизод применения компьютера \n"
                + "в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; \n"
                + "если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, \n"
                + "то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает \n"
                + "сообщение об этом и указывает размер недостающей суммы.");
        System.out.println("Денежные средства в наличии: " + cash + " руб.");
        System.out.println("Стоимость книг: " + price + " руб.");
        if (cash > price) {
            return "Ваша сдача: " + (cash - price) + " руб. " + "Cпасибо за покупку!";
        }
        if (cash < price) {
            return "Вам не хватает " + (price - cash) + " руб.";
        } else {
            return "Спасибо, что без сдачи. Всего доброго!";
        }
    }

    public void printBuyerCheckout() {
        System.out.println(checkout());
    }
}
