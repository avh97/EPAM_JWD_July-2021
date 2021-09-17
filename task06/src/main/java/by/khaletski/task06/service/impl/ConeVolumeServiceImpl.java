package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.ConeVolumeService;

public class ConeVolumeServiceImpl implements ConeVolumeService {
    @Override
    public double getConeVolume(Cone cone) {
        return (Math.PI / 3) * cone.getRadius() * cone.getRadius() * cone.getHeight();
    }
}