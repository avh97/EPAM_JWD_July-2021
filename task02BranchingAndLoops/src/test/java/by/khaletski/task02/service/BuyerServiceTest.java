package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BuyerServiceTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{170, 25, "Here's your change: 145.0 USD. Thank you for the purchase!"},
                {25, 170, "You don't have enough: 145.0 USD."},
                {25, 25, "Thank you for no change. All the best!"}};
    }

    @Test (dataProvider = "dataProvider")
    public void testCheckout(double cash, double price, String expected) {
        BuyerService buyerService = new BuyerService(cash, price);
        String actual = buyerService.checkout();
        assertEquals(actual, expected);
    }
}
