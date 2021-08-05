package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfEvenDigitsTest {

    @DataProvider(name = "dataProviderSumOfEvenDigits")
    public Object[][] createDataSumOfEvenDigits() {
        return new Object[][] {{new SumOfEvenDigits(120), new SumOfEvenDigits(2)},
                {new SumOfEvenDigits(100), new SumOfEvenDigits(0)},
                {new SumOfEvenDigits(-844), new SumOfEvenDigits(16)},
                {new SumOfEvenDigits(111), new SumOfEvenDigits(0)}};
    }

    @Test(dataProvider = "dataProviderSumOfEvenDigits")
    public void testSumOfEvenDigits(SumOfEvenDigits number, SumOfEvenDigits expected) {
        SumOfEvenDigits actual = number.sumOfEvenDigits();
        assertEquals(actual, expected);
    }

    @DataProvider(name = "dataProviderReverseNumber")
    public Object[][] createDataReverseNumber() {
        return new Object[][] {{new SumOfEvenDigits(120), new SumOfEvenDigits(21)},
                {new SumOfEvenDigits(100), new SumOfEvenDigits(1)},
                {new SumOfEvenDigits(-844), new SumOfEvenDigits(-448)},
                {new SumOfEvenDigits(111), new SumOfEvenDigits(111)}};
    }

    @Test (dataProvider = "dataProviderReverseNumber")
    public void testReverseNumber(SumOfEvenDigits number, SumOfEvenDigits expected) {
        SumOfEvenDigits actual = number.reverseNumber();
        assertEquals(actual, expected);
    }
}
