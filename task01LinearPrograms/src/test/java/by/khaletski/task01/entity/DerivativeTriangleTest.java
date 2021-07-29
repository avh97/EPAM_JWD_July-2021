package by.khaletski.task01.entity;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DerivativeTriangleTest {

    /**
     * Тест. Задача №24. Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c
     */

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{3, 4, 5}, {7, 8, 9},
                {7, 7.22, 5},
                {0.13, 0.14, 0.14}};
    }

    @Test (dataProvider = "dataProvider")
    public void testAngles(double sideA, double sideB, double sideC) {
        DerivativeTriangle triangle = new DerivativeTriangle(sideA, sideB, sideC);
        double sumOfAngles = triangle.getAngleA() + triangle.getAngleB() + triangle.getAngleC();
        assertEquals(sumOfAngles, 180, 1);
    }
}
