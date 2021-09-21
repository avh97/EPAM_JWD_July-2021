package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;

public class IsConeBaseServiceImpl {
    public boolean isConeBase(Cone cone) {
        //TODO predicate
        IsConeValidServiceImpl icConeValidService = new IsConeValidServiceImpl();
        if (!icConeValidService.isConeValid(cone)) {
            return false;
        }
        return ((cone.getOuterPoint().getZ() == 0 || cone.getUpperPoint().getZ() == 0)
                && ((cone.getInnerPoint().getZ() == 0 || cone.getOuterPoint().getZ() == 0)));
    }
}
