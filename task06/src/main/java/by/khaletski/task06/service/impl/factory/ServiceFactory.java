package by.khaletski.task06.service.impl.factory;

import by.khaletski.task06.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final IsConeValidServiceImpl isConeValidService = new IsConeValidServiceImpl();
    private final IsConeBaseServiceImpl isConeBaseService = new IsConeBaseServiceImpl();
    private final ConeAreaServiceImpl coneAreaService = new ConeAreaServiceImpl();
    private final ConeVolumeServiceImpl coneVolumeService = new ConeVolumeServiceImpl();
    private final ConeDissectionServiceImpl coneDissectionService = new ConeDissectionServiceImpl();
    private final SpecificationFilterServiceImpl specificationFilterService = new SpecificationFilterServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public IsConeValidServiceImpl getIsConeValidService() {
        return isConeValidService;
    }

    public IsConeBaseServiceImpl getIsConeBaseService() {
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
