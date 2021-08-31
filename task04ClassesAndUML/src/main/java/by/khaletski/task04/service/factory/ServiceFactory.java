package by.khaletski.task04.service.factory;

import by.khaletski.task04.service.ShowLocationService;
import by.khaletski.task04.service.ShowMaxPriceService;
import by.khaletski.task04.service.ShowMealsService;
import by.khaletski.task04.service.ShowMinPeriodService;
import by.khaletski.task04.service.ShowTransportService;
import by.khaletski.task04.service.ShowTypeService;
import by.khaletski.task04.service.SortByLocationService;
import by.khaletski.task04.service.SortByMealsService;
import by.khaletski.task04.service.SortByPeriodService;
import by.khaletski.task04.service.SortByPriceService;
import by.khaletski.task04.service.SortByTransportService;
import by.khaletski.task04.service.SortByTypeService;
import by.khaletski.task04.service.impl.PrintTourListImpl;
import by.khaletski.task04.service.impl.ShowLocationServiceImpl;
import by.khaletski.task04.service.impl.ShowMaxPriceServiceImpl;
import by.khaletski.task04.service.impl.ShowMealsServiceImpl;
import by.khaletski.task04.service.impl.ShowMinPeriodServiceImpl;
import by.khaletski.task04.service.impl.ShowTransportServiceImpl;
import by.khaletski.task04.service.impl.ShowTypeServiceImpl;
import by.khaletski.task04.service.impl.SortByLocationServiceImpl;
import by.khaletski.task04.service.impl.SortByMealsServiceImpl;
import by.khaletski.task04.service.impl.SortByPeriodServiceImpl;
import by.khaletski.task04.service.impl.SortByPriceServiceImpl;
import by.khaletski.task04.service.impl.SortByTransportServiceImpl;
import by.khaletski.task04.service.impl.SortByTypeServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final PrintTourListImpl printTourList = new PrintTourListImpl();
    private final ShowTypeService showTypeService = new ShowTypeServiceImpl();
    private final ShowLocationService showLocationService = new ShowLocationServiceImpl();
    private final ShowMealsService showMealsService = new ShowMealsServiceImpl();
    private final ShowTransportService showTransportService = new ShowTransportServiceImpl();
    private final ShowMinPeriodService showMinPeriodService = new ShowMinPeriodServiceImpl();
    private final ShowMaxPriceService showMaxPriceService = new ShowMaxPriceServiceImpl();
    private final SortByTypeService sortByTypeService = new SortByTypeServiceImpl();
    private final SortByLocationService sortByLocationService = new SortByLocationServiceImpl();
    private final SortByMealsService sortByMealsService = new SortByMealsServiceImpl();
    private final SortByTransportService sortByTransportService = new SortByTransportServiceImpl();
    private final SortByPeriodService sortByPeriodService = new SortByPeriodServiceImpl();
    private final SortByPriceService sortByPriceService = new SortByPriceServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    public PrintTourListImpl getPrintTourListImpl() {
        return printTourList;
    }

    public ShowTypeService getShowTypeServiceImpl() {
        return showTypeService;
    }

    public ShowLocationService getShowLocationServiceImpl() {
        return showLocationService;
    }

    public ShowMealsService getShowMealsServiceImpl() {
        return showMealsService;
    }

    public ShowTransportService getShowTransportServiceImpl() {
        return showTransportService;
    }

    public ShowMinPeriodService getShowMinPeriodServiceImpl() {
        return showMinPeriodService;
    }

    public ShowMaxPriceService getShowMaxPriceServiceImpl() {
        return showMaxPriceService;
    }

    public SortByTypeService getSortByTypeServiceImpl() {
        return sortByTypeService;
    }

    public SortByLocationService getSortByLocationServiceImpl() {
        return sortByLocationService;
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
