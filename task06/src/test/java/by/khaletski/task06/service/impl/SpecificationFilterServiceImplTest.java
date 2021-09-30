package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.factory.ServiceFactory;
import by.khaletski.task06.service.specification.AbstractSelector;
import by.khaletski.task06.service.specification.AreaGreaterThanSelector;
import by.khaletski.task06.service.specification.AreaSmallerOrEqualSelector;
import by.khaletski.task06.service.specification.VolumeSmallerOrEqualSelector;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationFilterServiceImplTest {

    @Test
    void specificationFilterServiceImplTest() {
        Cone cone0 = new Cone(new Cone.Point(0, 0, 0),
                new Cone.Point(10, 0, 0),
                new Cone.Point(0, 0, 25));
        Cone cone1 = new Cone(new Cone.Point(-5, -5, -5),
                new Cone.Point(10, 10, -5),
                new Cone.Point(-5, -5, 15.5));
        Cone cone2 = new Cone(new Cone.Point(12.3, 12.3, 12.3),
                new Cone.Point(7, 7, 12.3),
                new Cone.Point(12.3, 12.3, 40));
        Cone cone3 = new Cone(new Cone.Point(-45, -45, -30),
                new Cone.Point(3, 3, -30),
                new Cone.Point(-45, -45, -5));
        Map<Integer, Cone> coneMap = new HashMap<>();
        coneMap.put(0, cone0);
        coneMap.put(1, cone1);
        coneMap.put(2, cone2);
        coneMap.put(3, cone3);
        AbstractSelector<Cone> coneSelector = new AreaGreaterThanSelector(1000)
                .and(new AreaSmallerOrEqualSelector(3000))
                .or(new VolumeSmallerOrEqualSelector(5000));
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Map<Integer, Cone> actual = serviceFactory.getSpecificationFilterService()
                .find(coneMap, coneSelector);
        assertEquals(2, actual.size());
    }
}
