package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;

public class ConeVolumeServiceImpl {
    public double getConeVolume(Cone cone) {
        return (Math.PI / 3) * cone.getRadius() * cone.getRadius() * cone.getHeight();
    }
}
