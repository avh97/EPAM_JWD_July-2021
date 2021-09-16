package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.IsConeBaseService;
import by.khaletski.task06.service.IsConeValidService;

public class IsConeBaseServiceImpl implements IsConeBaseService {
    @Override
    public boolean isConeBase(Cone cone) {
        IsConeValidService icConeValidService = new IsConeValidServiceImpl();
        Cone.Point basePoint = new Cone.Point(0, 0, 0);
        if (!icConeValidService.isConeValid(cone)) {
            return false;
        }
        return (cone.getHeightPoint1().equals(basePoint) || cone.getRadiusPoint2().equals(basePoint))
                && (cone.getRadiusPoint1().equals(basePoint) || cone.getHeightPoint2().equals(basePoint));
    }
}
