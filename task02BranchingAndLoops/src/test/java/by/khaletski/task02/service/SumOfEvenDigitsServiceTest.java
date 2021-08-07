package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfEvenDigitsServiceTest {

    @DataProvider(name = "dataProviderSumOfEvenDigits")
    public Object[][] createDataSumOfEvenDigits() {
        return new Object[][] {{new SumOfEvenDigitsService(120), 2},
                {new SumOfEvenDigitsService(100), 0},
                {new SumOfEvenDigitsService(-844), 61},
                {new SumOfEvenDigitsService(111), 0}};
    }

    @Test(dataProvider = "dataProviderSumOfEvenDigits")
    public void testSumOfEvenDigits(SumOfEvenDigitsService actual, int expected) {
        assertEquals(actual.getNumber(), expected);
    }
}
