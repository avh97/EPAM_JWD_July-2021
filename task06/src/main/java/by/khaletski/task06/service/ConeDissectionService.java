package by.khaletski.task06.service;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;

public interface ConeDissectionService {
    double getDissectionProportion(Cone cone, Cone.Point point) throws ConeServiceException;
}
