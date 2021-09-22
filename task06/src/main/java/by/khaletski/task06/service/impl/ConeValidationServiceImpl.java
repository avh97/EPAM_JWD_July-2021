package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;

public class ConeValidationServiceImpl {
    public boolean isConeValid(Cone cone) {
        if (cone.getRadius() <= 0 || cone.getForming() <= 0) {
            return false;
        }
        return (cone.getInnerPoint().getX() == cone.getUpperPoint().getX()
                && cone.getInnerPoint().getZ() != cone.getUpperPoint().getZ()
                && cone.getInnerPoint().getY() == cone.getUpperPoint().getY()
                && cone.getInnerPoint().getZ() == cone.getOuterPoint().getZ());
    }
}
