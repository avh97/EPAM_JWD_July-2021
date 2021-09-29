package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConeVolumeServiceImplTest {

    public static Object[][] testData() {
        return new Object[][]{
                {new Cone(new Cone.Point(0, 0, 0),
                        new Cone.Point(10, 0, 0),
                        new Cone.Point(0, 0, 25)), 2618.0},
                {new Cone(new Cone.Point(-5, -5, -5),
                        new Cone.Point(10, 10, -5),
                        new Cone.Point(-5, -5, 15.5)), 9660.4},
                {new Cone(new Cone.Point(12.3, 12.3, 12.3),
                        new Cone.Point(7, 7, 12.3),
                        new Cone.Point(12.3, 12.3, 40)),1629.6},
                {new Cone(new Cone.Point(-45, -45, -30),
                        new Cone.Point(3, 3, -30),
                        new Cone.Point(-45, -45, -5)), 120637.2}
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    void coneVolumeServiceImplTest(Cone cone, double expected) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        try {
            assertEquals(serviceFactory.getConeVolumeService().calculate(cone), expected, 0.1);
        } catch (ConeServiceException e) {
            e.printStackTrace();
        }
    }
}
