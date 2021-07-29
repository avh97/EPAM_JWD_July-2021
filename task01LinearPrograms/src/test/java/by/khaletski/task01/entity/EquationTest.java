package by.khaletski.task01.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EquationTest {

    /**
     *  Тест. Задача №34. Дано действительное число x. Не пользуясь никакими другими арифметическими
     *  операциями, кроме умножения, сложения и вычитания, вычислите за минимальное количество
     *  операций 2*x^4 + 3*x^3 + 4*x^2 - 5*x + 6
     */


    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{0, 6}, {1, 20},
                {1.75, 61.83},
                {-7.7, 5865.67}};
    }

    @Test (dataProvider = "dataProvider")
    public void testSolutionOfEquation(double varX, double expected) {
        Equation solution = new Equation(varX);
        double actual = solution.getSolutionOfEquation(solution);
        assertEquals(actual, expected, 0.01);
    }
}
