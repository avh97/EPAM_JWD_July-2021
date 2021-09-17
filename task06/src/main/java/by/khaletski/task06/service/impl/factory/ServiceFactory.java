package by.khaletski.task06.service.impl.factory;

import by.khaletski.task06.service.ConeAreaService;
import by.khaletski.task06.service.ConeDissectionService;
import by.khaletski.task06.service.ConeVolumeService;
import by.khaletski.task06.service.IsConeBaseService;
import by.khaletski.task06.service.IsConeValidService;
import by.khaletski.task06.service.impl.ConeAreaServiceImpl;
import by.khaletski.task06.service.impl.ConeDissectionServiceImpl;
import by.khaletski.task06.service.impl.ConeVolumeServiceImpl;
import by.khaletski.task06.service.impl.IsConeBaseServiceImpl;
import by.khaletski.task06.service.impl.IsConeValidServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final IsConeValidServiceImpl isConeValidService = new IsConeValidServiceImpl();
    private final IsConeBaseServiceImpl isConeBaseService = new IsConeBaseServiceImpl();
    private final ConeAreaServiceImpl coneAreaService = new ConeAreaServiceImpl();
    private final ConeVolumeServiceImpl coneVolumeService = new ConeVolumeServiceImpl();
    private final ConeDissectionServiceImpl coneDissectionService = new ConeDissectionServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public IsConeValidService getIsConeValidService() {
        return isConeValidService;
    }

    public IsConeBaseService getIsConeBaseService() {
        return isConeBaseService;
    }

    public ConeAreaService getConeAreaService() {
        return getConeAreaService();
    }

    public ConeVolumeService getConeVolumeService() {
        return getConeVolumeService();
    }

    public ConeDissectionService getConeDissectionService() {
        return getConeDissectionService();
    }
}
