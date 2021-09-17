package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.IsConeBaseService;
import by.khaletski.task06.service.IsConeValidService;

public class IsConeBaseServiceImpl implements IsConeBaseService {
    @Override
    public boolean isConeBase(Cone cone) {
        //TODO predicate
        IsConeValidService icConeValidService = new IsConeValidServiceImpl();
        if (!icConeValidService.isConeValid(cone)) {
            return false;
        }
        return ((cone.getLowerPoint().getZ() == 0 || cone.getUpperPoint().getZ() == 0)
                && ((cone.getInnerPoint().getZ() == 0 || cone.getOuterPoint().getZ() == 0)));
    }
}
