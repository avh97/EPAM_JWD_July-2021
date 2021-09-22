package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class ConeDissectionServiceImpl {
    public double getDissectionProportion(Cone cone, Cone.Point point) throws ConeServiceException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        if (!(serviceFactory.getConeValidationService().isConeValid(cone)
                || point.getZ() > cone.getInnerPoint().getZ() && point.getZ() < cone.getUpperPoint().getZ())) {
            throw new ConeServiceException();
        }
        double fullHeight = cone.getHeight();
        double fullRadius = cone.getRadius();
        double truncatedHeight = Math.sqrt(Math.pow(cone.getInnerPoint().getZ() - point.getZ(), 2));
        double smallRadius = fullRadius - 2 * truncatedHeight * (fullRadius / fullHeight);
        double truncatedConeVolume = Math.PI / 3 * truncatedHeight
                * (fullRadius * fullRadius + fullRadius * smallRadius + smallRadius * smallRadius);
        double upperConeVolume = serviceFactory.getConeVolumeService().getConeVolume(cone) - truncatedConeVolume;
        return upperConeVolume / truncatedConeVolume;
    }
}
