package by.khaletski.task01.entity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EquilateralTriangleTest {

    /**
     * Тест. Задача №19. Дана сторона равностороннего треугольника. Найти площадь
     * этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
     */

    @DataProvider (name = "dataProviderArea")
    public Object[][] createAreaData() {
        return new Object[][] {{5, 10.83}, {9, 35.07},
                {25, 270.63},
                {0.5, 0.11}};
    }

    @Test (dataProvider = "dataProviderArea")
    public void testArea(double sideA, double expectedArea) {
        EquilateralTriangle triangle = new EquilateralTriangle(sideA);
        double actual = triangle.area();
        assertEquals(actual, expectedArea, 0.01);
    }

    @DataProvider (name = "dataProviderHeight")
    public Object[][] createHeightData() {
        return new Object[][] {{5, 4.33}, {9, 7.79},
                {25, 21.65},
                {0.5, 0.43}};
    }

    @Test (dataProvider = "dataProviderHeight")
    public void testHeight(double sideA, double expectedHeight) {
        EquilateralTriangle triangle = new EquilateralTriangle(sideA);
        double actual = triangle.height();
        assertEquals(actual, expectedHeight, 0.01);
    }

    @DataProvider (name = "dataProviderInscribedRadius")
    public Object[][] createInscribedRadiusData() {
        return new Object[][] {{5, 1.44}, {9, 2.60},
                {25, 7.22},
                {0.5, 0.14}};
    }


    @Test (dataProvider = "dataProviderInscribedRadius")
    public void testRadiusOfInscribedCircle(double sideA, double expectedInscribedRadius) {
        EquilateralTriangle triangle = new EquilateralTriangle(sideA);
        double actual = triangle.radiusOfInscribedCircle();
        assertEquals(actual, expectedInscribedRadius, 0.01);
    }

    @DataProvider (name = "dataProviderCircumscribedRadius")
    public Object[][] testRadiusOfCircumscribedCircle() {
        return new Object[][]{{5, 2.88}, {9, 5.20},
                {25, 14.43},
                {0.5, 0.29}};
    }

    @Test (dataProvider = "dataProviderCircumscribedRadius")
    public void testRadiusOfCircumscribedCircle(double sideA, double expectedCircumscribedRadius) {
        EquilateralTriangle triangle = new EquilateralTriangle(sideA);
        double actual = triangle.radiusOfCircumscribedCircle();
            assertEquals(actual, expectedCircumscribedRadius, 0.01);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void invalidTriangleMeasurements() {
        EquilateralTriangle triangle = new EquilateralTriangle(0);
    }
}
