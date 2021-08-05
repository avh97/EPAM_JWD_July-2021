package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SunflowerTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{1, true},
                {7, true},
                {66, false},
                {21, true}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfLoves(int number, boolean expected) {
        Sunflower sunflower = new Sunflower(number);
        boolean actual = sunflower.ifLoves();
        assertEquals(actual, expected);
    }
}
