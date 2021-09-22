package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class ConeAreaServiceImpl {
    //TODO Function
    public double getConeArea(Cone cone) throws ConeServiceException {
        if (!ServiceFactory.getInstance().getConeValidationService().isConeValid(cone)) {
            throw new ConeServiceException();
        }
        double radius = cone.getRadius();
        double forming = cone.getForming();
        return Math.PI * radius * (radius + forming);
    }
}
