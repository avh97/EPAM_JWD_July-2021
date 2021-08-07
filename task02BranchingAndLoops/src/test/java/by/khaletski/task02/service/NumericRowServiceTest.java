package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumericRowServiceTest {

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{20, 0.1, 0.3125},
                {20, 0.05, 0.3125},
                {10, 0.03, 0.340},
                {10, 0.01, 0.366}};
    }

    @Test(dataProvider = "dataProvider")
    public void testSumOfNumbers(final int sizeOfRow, final double givenNumberE, double expected) {
        NumericRowService numericRowService = new NumericRowService(sizeOfRow, givenNumberE);
        double actual = numericRowService.sumOfNumbers();
        assertEquals(actual, expected, 0.01);
    }
}
