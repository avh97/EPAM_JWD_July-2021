package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerNumbersTest {

    @DataProvider (name = "dataProviderTestEvenNumbers")
    public Object[][] createDataForTestEvenNumbers() {
        return new Object[][] {{new IntegerNumbers(2, 15),
                new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14))},
                {new IntegerNumbers(-5, 5),
                new ArrayList<Integer>(Arrays.asList(-4, -2, 2, 4))}};
    }

    @Test (dataProvider = "dataProviderTestEvenNumbers")
    public void testEvenNumbers(IntegerNumbers numbers, ArrayList<Integer> expected) {
        ArrayList<Integer> actual = numbers.evenNumbers();
        assertEquals(actual, expected);
    }

    @DataProvider (name = "dataProviderSumOfSquares")
    public Object[][] createData1() {
        return new Object[][] {{new IntegerNumbers(10, 30), 9170},
                {new IntegerNumbers(-5, 5), 110},
                {new IntegerNumbers(0, 7), 140}};
    }

    @Test (dataProvider = "dataProviderSumOfSquares")
    public void testSumOfSquares(IntegerNumbers numbers, int expected) {
        int actual = numbers.sumOfSquares();
        assertEquals(actual, expected);
    }
}
