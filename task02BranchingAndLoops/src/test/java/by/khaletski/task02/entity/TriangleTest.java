package by.khaletski.task02.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{1, 1, 1, true},
                {1, 2, 3, false},
                {3, 3, 3, true},
                {3, 2, 1, false}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfEquilateralTriangle(double sideA, double sideB, double sideC, boolean expected) {
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        boolean actual = triangle.ifEquilateralTriangle();
        assertEquals(actual, expected);
    }
}