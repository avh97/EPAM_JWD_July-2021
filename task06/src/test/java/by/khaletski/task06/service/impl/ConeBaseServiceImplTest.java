package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConeBaseServiceImplTest {

    public static Object[][] testData() {
        return new Object[][]{
                {new Cone(new Cone.Point(0, 0, 0),
                        new Cone.Point(10, 0, 0),
                        new Cone.Point(0, 0, 25)), true},
                {new Cone(new Cone.Point(-5, -5, -5),
                        new Cone.Point(10, 10, -5),
                        new Cone.Point(-5, -5, 15.5)), false},
                {new Cone(new Cone.Point(12.3, 12.3, 12.3),
                        new Cone.Point(7, 7, 12.3),
                        new Cone.Point(12.3, 12.3, 40)), false},
                {new Cone(new Cone.Point(-45, -45, -30),
                        new Cone.Point(3, 3, -30),
                        new Cone.Point(-45, -45, -5)), false},
                {new Cone(new Cone.Point(0, 0, 3),
                        new Cone.Point(10, 0, 0),
                        new Cone.Point(0, 0, 25)), false},
                {new Cone(new Cone.Point(-5, -5, -5),
                        new Cone.Point(10, 10, -5),
                        new Cone.Point(-5, -0, 15.5)), false},
                {new Cone(new Cone.Point(12.3, 12.3, 12.3),
                        new Cone.Point(7, 7, 12.3),
                        new Cone.Point(12.3, 12.3, 12.3)), false},
                {new Cone(new Cone.Point(-45, -45, -30),
                        new Cone.Point(3, 3, -45),
                        new Cone.Point(-45, -45, -5)), false}
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    void coneBaseServiceImplTest(Cone cone, boolean expected) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        try {
            assertEquals(serviceFactory.getConeBaseService().check(cone), expected);
        } catch (ConeServiceException e) {
            e.printStackTrace();
        }
    }
}
