package by.khaletski.task06.service.factory;

import by.khaletski.task06.service.Calculable;
import by.khaletski.task06.service.Checkable;
import by.khaletski.task06.service.Dissectable;
import by.khaletski.task06.service.Specification;
import by.khaletski.task06.service.Validatable;
import by.khaletski.task06.service.impl.ConeAreaServiceImpl;
import by.khaletski.task06.service.impl.ConeBaseServiceImpl;
import by.khaletski.task06.service.impl.ConeDissectionServiceImpl;
import by.khaletski.task06.service.impl.ConeValidationServiceImpl;
import by.khaletski.task06.service.impl.ConeVolumeServiceImpl;
import by.khaletski.task06.service.impl.SpecificationFilterServiceImpl;

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
