package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConeDissectionServiceImplTest {
    public static Object[][] testData() {
        return new Object[][]{
                {new Cone(new Cone.Point(0, 0, 0),
                        new Cone.Point(10, 0, 0),
                        new Cone.Point(0, 0, 25)),
                        new Cone.Point(-3, -5, 10), 0.98},
                {new Cone(new Cone.Point(-5, -5, -5),
                        new Cone.Point(10, 10, -5),
                        new Cone.Point(-5, -5, 15.5)),
                        new Cone.Point(0, 0, 0), 1.31},
                {new Cone(new Cone.Point(12.3, 12.3, 12.3),
                        new Cone.Point(7, 7, 12.3),
                        new Cone.Point(12.3, 12.3, 40)),
                        new Cone.Point(-110, 5, 20), 1.19},
                {new Cone(new Cone.Point(-45, -45, -30),
                        new Cone.Point(3, 3, -30),
                        new Cone.Point(-45, -45, 5)),
                        new Cone.Point(20, 25, -5), 0.85}
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    void coneDissectionServiceImplTest(Cone cone, Cone.Point point, double expected) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        try {
            assertEquals(serviceFactory.getConeDissectionService()
                    .dissect(cone, point), expected, 0.1);
        } catch (ConeServiceException e) {
            e.printStackTrace();
        }
    }
}
