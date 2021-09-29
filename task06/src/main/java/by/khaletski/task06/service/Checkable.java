package by.khaletski.task06.service;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;

public interface Checkable {
    boolean check(Cone cone) throws ConeServiceException;
}
