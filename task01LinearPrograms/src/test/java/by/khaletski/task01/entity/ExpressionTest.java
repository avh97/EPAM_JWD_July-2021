package by.khaletski.task01.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExpressionTest {

    /**
     * Тест. Задача №9. Найдите значение выражения ((a/c) * (b/d)) - ((a*b -c)/c*d)
     */

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{1, 1, 1, 1, 1},
                {1, 2, 3, 4, 1.5},
                {11, 15, 4, 3, -107},
                {-3, -4, 5, 6, -7.99}};
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testValueOfExpressionException() {
        Expression value = new Expression(1,1,0,0);
        value.getValueOfExpression(value);
    }


    @Test (dataProvider = "dataProvider")
    public void testValueOfExpression(double varA,  double varB, double varC, double varD, double expected) {
        Expression value = new Expression(varA, varB, varC, varD);
        double actual = value.getValueOfExpression(value);
        assertEquals(actual, expected, 0.01);
    }
}
