package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.Dissectable;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;

public class ConeDissectionServiceImpl implements Dissectable {
    @Override
    public final double dissect(final Cone cone, final Cone.Point point) throws ConeServiceException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        if (!(serviceFactory.getConeValidationService().validate(cone)
                || point.getZ() > cone.getInnerPoint().getZ() && point.getZ() < cone.getUpperPoint().getZ())) {
            throw new ConeServiceException();
        }
        double fullHeight = cone.getHeight();
        double fullRadius = cone.getRadius();
        double truncatedHeight = Math.sqrt(Math.pow(cone.getInnerPoint().getZ() - point.getZ(), 2));
        double smallRadius = fullRadius - 2 * truncatedHeight * (fullRadius / fullHeight);
        double truncatedConeVolume = Math.PI / 3 * truncatedHeight
                * (fullRadius * fullRadius + fullRadius * smallRadius + smallRadius * smallRadius);
        double upperConeVolume = serviceFactory.getConeVolumeService().calculate(cone) - truncatedConeVolume;
        return upperConeVolume / truncatedConeVolume;
    }
}
