package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbersTest {

    @DataProvider (name = "dataProviderTestEvenNumbers")
    public Object[][] createDataEvenNumbers() {
        return new Object[][] {{new EvenNumbers(2, 15),
                new EvenNumbers(new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14)))},
                {new EvenNumbers(-5, 5),
                        new EvenNumbers(new ArrayList<>(Arrays.asList(-4, -2, 2, 4)))}};
    }

    @Test (dataProvider = "dataProviderTestEvenNumbers")
    public void testEvenNumbers(EvenNumbers numbers, EvenNumbers expected) {
        EvenNumbers actual = numbers.evenNumbersList();
        assertEquals(actual, expected);
    }
}
