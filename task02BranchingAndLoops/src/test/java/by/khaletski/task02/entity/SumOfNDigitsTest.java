package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfNDigitsTest {

    @DataProvider(name = "dataProviderSumOfEvenDigits")
    public Object[][] createDataSumOfNDigitsOfNDigitNumber() {
        return new Object[][] {{new SumOfNDigits(4, 15), 1059},
                {new SumOfNDigits(3, 10), 109},
                {new SumOfNDigits(2, 12), 39},
                {new SumOfNDigits(1, 3), 3}};
    }

    @Test(dataProvider = "dataProviderSumOfEvenDigits")
    public void testSumOfNDigitsOfNDigitNumber(SumOfNDigits sumOfNDigits, int expected) {
        int actual = sumOfNDigits.getNumbers().get(0);
        assertEquals(actual, expected);
    }
}