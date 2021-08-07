package by.khaletski.task02.service;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbersServiceTest {

    @DataProvider (name = "dataProviderTestEvenNumbers")
    public Object[][] createDataEvenNumbers() {
        return new Object[][] {{new EvenNumbersService(2, 15),
                new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14))},
                {new EvenNumbersService(-5, 5),
                        new ArrayList<>(Arrays.asList(-4, -2, 2, 4))}};
    }

    @Test (dataProvider = "dataProviderTestEvenNumbers")
    public void testEvenNumbers(EvenNumbersService numbers, ArrayList<Integer> expected) {
        ArrayList<Integer> actual = numbers.getNumbers();
        assertEquals(actual, expected);
    }
}
