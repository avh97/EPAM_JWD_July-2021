package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SunflowerServiceTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{1, true},
                {7, true},
                {66, false},
                {21, true}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfLoves(int number, boolean expected) {
        SunflowerService sunflowerService = new SunflowerService(number);
        boolean actual = sunflowerService.ifLoves();
        assertEquals(actual, expected);
    }
}
