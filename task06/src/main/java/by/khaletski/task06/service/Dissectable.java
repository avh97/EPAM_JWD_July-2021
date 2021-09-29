package by.khaletski.task06.service;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;

public interface Dissectable {
    double dissect(Cone cone, Cone.Point point) throws ConeServiceException;
}
