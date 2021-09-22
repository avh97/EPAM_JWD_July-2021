package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class ConeBaseServiceImpl {
    public boolean isConeBase(Cone cone) throws ConeServiceException {
        //TODO predicate
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        if (!serviceFactory.getConeValidationService().isConeValid(cone)) {
            throw new ConeServiceException();
        }
        return ((cone.getOuterPoint().getZ() == 0 || cone.getUpperPoint().getZ() == 0)
                && ((cone.getInnerPoint().getZ() == 0 || cone.getOuterPoint().getZ() == 0)));
    }
}
