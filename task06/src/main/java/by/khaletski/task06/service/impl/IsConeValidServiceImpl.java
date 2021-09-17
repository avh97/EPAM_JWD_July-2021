package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.IsConeValidService;

public class IsConeValidServiceImpl implements IsConeValidService {
    @Override
    public boolean isConeValid(Cone cone) {
        if (cone.getRadius() <= 0 || cone.getForming() <= 0) {
            return false;
        }
        return (cone.getOuterPoint().equals(cone.getLowerPoint())
                && cone.getInnerPoint().getX() == cone.getUpperPoint().getX()
                && cone.getInnerPoint().getY() == cone.getUpperPoint().getY()
                && cone.getInnerPoint().getZ() == cone.getLowerPoint().getZ());
    }
}
