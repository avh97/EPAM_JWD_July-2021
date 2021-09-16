package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.IsConeValidService;

public class IsConeValidServiceImpl implements IsConeValidService {
    @Override
    public boolean isConeValid(Cone cone) {
        if (cone.getRadius() <= 0 || cone.getHeight() <= 0) {
            return false;
        }
        return (cone.getHeightPoint1().equals(cone.getRadiusPoint1())
                || cone.getHeightPoint1().equals(cone.getRadiusPoint2()))
                || (cone.getHeightPoint2().equals(cone.getRadiusPoint1())
                || cone.getHeightPoint2().equals(cone.getRadiusPoint2()));
    }
}
