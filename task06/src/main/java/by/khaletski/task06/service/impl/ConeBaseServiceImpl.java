package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.Checkable;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;

public class ConeBaseServiceImpl implements Checkable {
    public final boolean check(final Cone cone) throws ConeServiceException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        if (!serviceFactory.getConeValidationService().validate(cone)) {
            throw new ConeServiceException();
        }
        return ((cone.getOuterPoint().getZ() == 0 || cone.getUpperPoint().getZ() == 0)
                && ((cone.getInnerPoint().getZ() == 0 || cone.getOuterPoint().getZ() == 0)));
    }
}
