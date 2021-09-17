package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.ConeDissectionService;
import by.khaletski.task06.service.ConeVolumeService;
import by.khaletski.task06.service.impl.exception.ConeServiceException;

public class ConeDissectionServiceImpl implements ConeDissectionService {
    @Override
    public double getDissectionProportion(Cone cone, Cone.Point point) throws ConeServiceException {
        ConeVolumeService coneVolumeService = new ConeVolumeServiceImpl();
        Cone.Point newPoint = new Cone.Point(cone.getUpperPoint().getX(), cone.getUpperPoint().getY(), point.getZ());
        if (!(point.getZ() > cone.getInnerPoint().getZ() && point.getZ() < cone.getUpperPoint().getZ())) {
            throw new ConeServiceException();
        }
        double height = Math.sqrt((Math.pow(cone.getLowerPoint().getX() - cone.getLowerPoint().getX(), 2))
                + (Math.pow(cone.getLowerPoint().getY() - cone.getLowerPoint().getY(), 2)
                + (Math.pow(cone.getLowerPoint().getZ() - newPoint.getZ(), 2))));
        double smallRadius = ((2 * cone.getRadius()) - height * ((cone.getRadius()) / height)) / 2;
        double bigRadius = cone.getRadius();
        double truncatedConeVolume = (Math.PI / 3) * height
                * (bigRadius * bigRadius + bigRadius * smallRadius + smallRadius * smallRadius);
        double upperConeVolume = coneVolumeService.getConeVolume(cone) - truncatedConeVolume;
        return (upperConeVolume / truncatedConeVolume);
    }
}
