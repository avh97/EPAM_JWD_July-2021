package by.khaletski.task04.view;

import by.khaletski.task04.dao.factory.DAOFactory;
import by.khaletski.task04.entity.TourList;
import by.khaletski.task04.entity.enums.Type;
import by.khaletski.task04.service.factory.ServiceFactory;
import by.khaletski.task04.service.impl.ShowTypeImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.info("Program started.");
        ShowTypeImpl showType = new ShowTypeImpl();
        TourList tourList = DAOFactory.getInstance().getTourListFill().fill();
        System.out.println(showType.showType(tourList, Type.RECREATION));
//        ServiceFactory.getInstance().getSortByLocationServiceImpl().sortByLocation(tourList);
//        for (int i = 0; i < tourList.getTours().size(); i++) {
//            System.out.println(tourList.getTours().get(i));
//        }
        LOGGER.info("Program executed.");
    }
}
