package by.khaletski.task02.service;

import by.khaletski.task02.entity.Triangle;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleServiceTest {

    @DataProvider (name = "dataProvider")
    public Object[][] createData() {
        return new Object[][] {{new Triangle(1, 1, 1), true},
                {new Triangle(1, 2, 3), false},
                {new Triangle(3, 3, 3), true},
                {new Triangle(3, 2, 1), false}};
    }

    @Test (dataProvider = "dataProvider")
    public void testIfEquilateralTriangle(Triangle triangle, boolean expected) {
        TriangleService triangleService = new TriangleService
                (new Triangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        boolean actual = triangleService.ifEquilateralTriangle();
        assertEquals(actual, expected);
    }
}
