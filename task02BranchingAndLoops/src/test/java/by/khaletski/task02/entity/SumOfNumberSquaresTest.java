package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfNumberSquaresTest {

    @DataProvider(name = "dataProviderSumOfSquares")
    public Object[][] createDataSumOfSquares() {
        return new Object[][] {{new SumOfNumberSquares(10, 30), 9170},
                {new SumOfNumberSquares(-5, 5), 110},
                {new SumOfNumberSquares(0, 7), 140},
                {new SumOfNumberSquares(1, 100), 338350}};
    }

    @Test (dataProvider = "dataProviderSumOfSquares")
    public void testSumOfSquares(SumOfNumberSquares numbers, int expected) {
        int actual = numbers.sumOfSquares();
        assertEquals(actual, expected);
    }
}