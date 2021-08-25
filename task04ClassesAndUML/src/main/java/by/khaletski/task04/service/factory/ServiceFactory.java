package by.khaletski.task04.service.factory;

import by.khaletski.task04.service.*;
import by.khaletski.task04.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final SortByTypeService sortByTypeService = new SortByTypeServiceImpl();
    private final SortByLocationService sortByLocationService = new SortByLocationServiceImpl();
    private final SortByHotelService sortByHotelService = new SortByHotelServiceImpl();
    private final SortByMealsService sortByMealsService = new SortByMealsServiceImpl();
    private final SortByTransportService sortByTransportService = new SortByTransportServiceImpl();
    private final SortByPeriodService sortByPeriodService = new SortByPeriodServiceImpl();
    private final SortByPriceService sortByPriceService = new SortByPriceServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public SortByTypeService getSortByTypeServiceImpl() {
        return sortByTypeService;
    }

    public SortByLocationService getSortByLocationServiceImpl() {
        return sortByLocationService;
    }

    public SortByHotelService getSortByHotelServiceImpl() {
        return sortByHotelService;
    }

    public SortByMealsService getSortByMealsServiceImpl() {
        return sortByMealsService;
    }

    public SortByTransportService getSortByTransportServiceImpl() {
        return sortByTransportService;
    }

    public SortByPeriodService getSortByPeriodServiceImpl() {
        return sortByPeriodService;
    }

    public SortByPriceService getSortByPriceServiceImpl() {
        return sortByPriceService;
    }
}
