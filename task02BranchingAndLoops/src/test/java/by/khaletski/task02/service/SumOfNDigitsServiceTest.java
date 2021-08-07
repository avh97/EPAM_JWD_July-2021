package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfNDigitsServiceTest {

    @DataProvider(name = "dataProviderSumOfEvenDigits")
    public Object[][] createDataSumOfNDigitsOfNDigitNumber() {
        return new Object[][] {{new SumOfNDigitsService(4, 15), 1059},
                {new SumOfNDigitsService(3, 10), 109},
                {new SumOfNDigitsService(2, 12), 39},
                {new SumOfNDigitsService(1, 3), 3}};
    }

    @Test(dataProvider = "dataProviderSumOfEvenDigits")
    public void testSumOfNDigitsOfNDigitNumber(SumOfNDigitsService sumOfNDigitsService, int expected) {
        int actual = sumOfNDigitsService.getNumbers().get(0);
        assertEquals(actual, expected);
    }
}
