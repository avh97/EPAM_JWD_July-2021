package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfNumberSquaresServiceTest {

    @DataProvider(name = "dataProviderSumOfSquares")
    public Object[][] createDataSumOfSquares() {
        return new Object[][] {{new SumOfNumberSquaresService(10, 30), 9170},
                {new SumOfNumberSquaresService(-5, 5), 110},
                {new SumOfNumberSquaresService(0, 7), 140},
                {new SumOfNumberSquaresService(1, 100), 338350}};
    }

    @Test (dataProvider = "dataProviderSumOfSquares")
    public void testSumOfSquares(SumOfNumberSquaresService numbers, int expected) {
        int actual = numbers.sumOfSquares();
        assertEquals(actual, expected);
    }
}
