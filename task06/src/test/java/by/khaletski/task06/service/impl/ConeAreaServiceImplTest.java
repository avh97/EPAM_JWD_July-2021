package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConeAreaServiceImplTest {

    public static Object[][] testData() {
        return new Object[][]{
                {new Cone(new Cone.Point(0, 0, 0),
                        new Cone.Point(10, 10, 0),
                        new Cone.Point(0, 0, 25)), 1904.4},
                {new Cone(new Cone.Point(-5, -5, -5),
                        new Cone.Point(10, 10, -5),
                        new Cone.Point(-5, -5, 15.5)), 3379.7},
                {new Cone(new Cone.Point(12.3, 12.3, 12.3),
                        new Cone.Point(7, 7, 12.3),
                        new Cone.Point(12.3, 12.3, 40)), 852.2},
                {new Cone(new Cone.Point(-45, -45, -30),
                        new Cone.Point(3, 3, -30),
                        new Cone.Point(-45, -45, -5)), 29903.5}
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    public void coneAreaServiceImplTest(Cone cone, double expected) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        try {
            assertEquals(serviceFactory.getConeAreaService().getConeArea(cone), expected, 0.1);
        } catch (ConeServiceException e) {
            e.printStackTrace();
        }
    }
}
