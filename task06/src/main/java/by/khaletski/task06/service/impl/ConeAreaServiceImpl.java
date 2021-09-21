package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class ConeAreaServiceImpl {
    //TODO Function
    public double getConeArea(Cone cone) throws ConeServiceException {
        if (!ServiceFactory.getInstance().getIsConeValidService().isConeValid(cone)) {
            throw new ConeServiceException();
        }
        return Math.PI * cone.getRadius() * (cone.getRadius() + cone.getForming());
    }
}
