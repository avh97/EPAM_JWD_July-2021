package by.khaletski.task06.view;

import by.khaletski.task06.dao.Storage;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;
import by.khaletski.task06.service.specification.AreaGreaterThanSelector;
import by.khaletski.task06.entity.Cone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    static final Logger LOGGER = LogManager.getLogger(Runner.class);

    /**
     * Разработать классы Точка и Конус. Создать методы и тесты: вычисления площади
     * поверхности фигуры и ее объема, а также соотношения объемов получаемых в результате
     * рассечения фигуры координатной плоскостью; является ли объект заданной фигурой;
     * находится ли основание фигуры на одной из координатных плоскостей.
     */

    public static void main(String[] args) {
        var coneSelector = new AreaGreaterThanSelector(100)
                .or(new AreaGreaterThanSelector(200));

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        System.out.println(serviceFactory.getSpecificationFilterService()
                .find(Storage.getInstance().read(), coneSelector));
        Cone cone0 = new Cone(new Cone.Point(0, 0, 0),
                new Cone.Point(10, 0, 0),
                new Cone.Point(0, 0, 25));
        Cone cone1 = new Cone(new Cone.Point(-5, -5, -5),
                new Cone.Point(10, 10, -5),
                new Cone.Point(-5, -5, 15.5));
        Cone cone2 = new Cone(new Cone.Point(12.3, 12.3, 12.3),
                new Cone.Point(7, 7, 12.3),
                new Cone.Point(12.3, 12.3, 40));
        Cone cone3 = new Cone(new Cone.Point(-45, -45, -30),
                new Cone.Point(3, 3, -30),
                new Cone.Point(-45, -45, -5));
        try {
            System.out.println(serviceFactory.getConeAreaService().calculate(cone0));
            System.out.println(serviceFactory.getConeAreaService().calculate(cone1));
            System.out.println(serviceFactory.getConeAreaService().calculate(cone2));
            System.out.println(serviceFactory.getConeAreaService().calculate(cone3));
            System.out.println(serviceFactory.getConeDissectionService()
                    .dissect(cone0, new Cone.Point(-7, -5, 15)));
        } catch (ConeServiceException e) {
            e.printStackTrace();
        }
    }
}
