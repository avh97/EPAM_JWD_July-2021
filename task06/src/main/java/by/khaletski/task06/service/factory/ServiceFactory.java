package by.khaletski.task06.service.factory;

import by.khaletski.task06.service.*;
import by.khaletski.task06.service.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final Validatable isConeValidService = new ConeValidationServiceImpl();
    private final Checkable isConeBaseService = new ConeBaseServiceImpl();
    private final Calculable coneAreaService = new ConeAreaServiceImpl();
    private final Calculable coneVolumeService = new ConeVolumeServiceImpl();
    private final Dissectable coneDissectionService = new ConeDissectionServiceImpl();
    private final Specification specificationFilterService = new SpecificationFilterServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public Validatable getConeValidationService() {
        return isConeValidService;
    }

    public Checkable getConeBaseService() {
        return isConeBaseService;
    }

    public Calculable getConeAreaService() {
        return coneAreaService;
    }

    public Calculable getConeVolumeService() {
        return coneVolumeService;
    }

    public Dissectable getConeDissectionService() {
        return coneDissectionService;
    }

    public Specification getSpecificationFilterService() {
        return specificationFilterService;
    }
}
