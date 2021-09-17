package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.ConeAreaService;

public class ConeAreaServiceImpl implements ConeAreaService {
    @Override
    public double getConeArea(Cone cone) {
        return Math.PI * cone.getRadius() * (cone.getRadius() + cone.getForming());
    }
}
