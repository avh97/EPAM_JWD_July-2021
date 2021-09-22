package by.khaletski.task06.service.impl.factory;

import by.khaletski.task06.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final ConeValidationServiceImpl isConeValidService = new ConeValidationServiceImpl();
    private final ConeBaseServiceImpl isConeBaseService = new ConeBaseServiceImpl();
    private final ConeAreaServiceImpl coneAreaService = new ConeAreaServiceImpl();
    private final ConeVolumeServiceImpl coneVolumeService = new ConeVolumeServiceImpl();
    private final ConeDissectionServiceImpl coneDissectionService = new ConeDissectionServiceImpl();
    private final SpecificationFilterServiceImpl specificationFilterService = new SpecificationFilterServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public ConeValidationServiceImpl getConeValidationService() {
        return isConeValidService;
    }

    public ConeBaseServiceImpl getConeBaseService() {
        return isConeBaseService;
    }

    public ConeAreaServiceImpl getConeAreaService() {
        return coneAreaService;
    }

    public ConeVolumeServiceImpl getConeVolumeService() {
        return coneVolumeService;
    }

    public ConeDissectionServiceImpl getConeDissectionService() {
        return coneDissectionService;
    }

    public SpecificationFilterServiceImpl getSpecificationFilterService() {
        return specificationFilterService;
    }
}
