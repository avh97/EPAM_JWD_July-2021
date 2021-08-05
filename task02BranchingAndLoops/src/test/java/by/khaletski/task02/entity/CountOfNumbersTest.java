package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountOfNumbersTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{1, 2, 3, 3},
                {1, 0, 1, 2},
                {1, 0, -1, 1},
                {-3, -2, -1, 0}};
    }

    @Test (dataProvider = "dataProvider")
    public void testPositiveNumbersCounter(double numA, double numB, double numC, int expected) {
        CountOfNumbers countOfNumbers = new CountOfNumbers(numA, numB, numC);
        int actual = countOfNumbers.positiveNumbersCounter();
        assertEquals(actual, expected);
    }
}