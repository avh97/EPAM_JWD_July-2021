package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparatorServiceTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{0, 0, true},
        {1, 1, true},
        {2, 3, false},
        {3, 4, false}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfNumbersEqual(double numberA, double numberB, boolean expected) {
        ComparatorService comparatorService = new ComparatorService(numberA, numberB);
        boolean actual = comparatorService.ifNumbersEqual();
        assertEquals(actual, expected);
    }
}
