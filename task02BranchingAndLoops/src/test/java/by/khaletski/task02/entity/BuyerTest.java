package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BuyerTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{170, 25, "Ваша сдача: 145.0 руб. Cпасибо за покупку!"},
                {25, 170, "Вам не хватает 145.0 руб."},
                {25, 25, "Спасибо, что без сдачи. Всего доброго!"}};
    }

    @Test (dataProvider = "dataProvider")
    public void testCheckout(double cash, double price, String expected) {
        Buyer buyer = new Buyer(cash, price);
        String actual = buyer.checkout();
        assertEquals(actual, expected);
    }
}