package by.khaletski.task02.service;

import by.khaletski.task02.entity.Buyer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BuyerServiceTest {

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][]{{new Buyer(170, 25),
                "Here's your change: 145.0 USD. Thank you for the purchase!"},
                {new Buyer(25, 170), "You don't have enough: 145.0 USD."},
                {new Buyer(25, 25), "Thank you for no change. All the best!"}};
    }

    @Test(dataProvider = "dataProvider")
    public void testCheckout(Buyer buyer, String expected) {
        BuyerService buyerService = new BuyerService(buyer);
        String actual = buyerService.checkout();
        assertEquals(actual, expected);
    }
}