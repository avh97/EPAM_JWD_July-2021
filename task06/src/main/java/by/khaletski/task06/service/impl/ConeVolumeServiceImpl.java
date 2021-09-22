package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class ConeVolumeServiceImpl {
    public double getConeVolume(Cone cone) throws ConeServiceException {
        if (!ServiceFactory.getInstance().getConeValidationService().isConeValid(cone)) {
            throw new ConeServiceException();
        }
        double radius = cone.getRadius();
        double height = cone.getHeight();
        return Math.PI / 3 * radius * radius * height;
    }
}
