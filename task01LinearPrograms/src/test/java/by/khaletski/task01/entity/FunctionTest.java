package by.khaletski.task01.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionTest {

    /**
     * Тест. Задача №4. Найдите значение функции z = ((a-3)*b/2)+3
     */

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{0, 0, 3},
                        {1, 1, 2},
                        {-5, 3, -9},
                        {15, -3, -15}};
    }

    @Test (dataProvider = "dataProvider")
    public void testValueOfFunction(double varA, double varB, double expected) {
        Function value = new Function(varA, varB);
        double actual = value.getValueOfFunction(value);
        assertEquals(actual, expected);
    }
}
