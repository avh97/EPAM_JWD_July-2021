package by.khaletski.task02.service;

import by.khaletski.task02.entity.Sunflower;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SunflowerServiceTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{new Sunflower(1), true},
                {new Sunflower(7), true},
                {new Sunflower(66), false},
                {new Sunflower(21), true}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfLoves(Sunflower sunflower, boolean expected) {
        SunflowerService sunflowerService = new SunflowerService(sunflower);
        boolean actual = sunflowerService.ifLoves();
        assertEquals(actual, expected);
    }
}
