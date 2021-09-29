package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.Calculable;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;

public class ConeAreaServiceImpl implements Calculable {
    public final double calculate(final Cone cone) throws ConeServiceException {
        if (!ServiceFactory.getInstance().getConeValidationService().validate(cone)) {
            throw new ConeServiceException();
        }
        double radius = cone.getRadius();
        double forming = cone.getForming();
        return Math.PI * radius * (radius + forming);
    }
}
