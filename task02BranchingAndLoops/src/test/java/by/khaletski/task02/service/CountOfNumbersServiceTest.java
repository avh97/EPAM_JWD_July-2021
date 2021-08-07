package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountOfNumbersServiceTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{1, 2, 3, 3},
                {1, 0, 1, 2},
                {1, 0, -1, 1},
                {-3, -2, -1, 0}};
    }

    @Test (dataProvider = "dataProvider")
    public void testPositiveNumbersCounter(double numA, double numB, double numC, int expected) {
        CountOfNumbersService countOfNumbersService = new CountOfNumbersService(numA, numB, numC);
        int actual = countOfNumbersService.positiveNumbersCounter();
        assertEquals(actual, expected);
    }
}
