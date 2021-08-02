package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparatorTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{0, 0, true},
        {1, 1, true},
        {2, 3, false},
        {3, 4, false}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfNumbersEqual(double numA, double numB, boolean expected) {
        Comparator comparator = new Comparator(numA, numB);
        boolean actual = comparator.ifNumbersEqual();
        assertEquals(actual, expected);
    }
}
