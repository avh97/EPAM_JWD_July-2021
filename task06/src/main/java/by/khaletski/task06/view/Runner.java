package by.khaletski.task06.view;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.ConeDissectionService;
import by.khaletski.task06.service.ConeVolumeService;
import by.khaletski.task06.service.IsConeBaseService;
import by.khaletski.task06.service.IsConeValidService;
import by.khaletski.task06.service.impl.ConeDissectionServiceImpl;
import by.khaletski.task06.service.impl.ConeVolumeServiceImpl;
import by.khaletski.task06.service.impl.IsConeBaseServiceImpl;
import by.khaletski.task06.service.impl.IsConeValidServiceImpl;
import by.khaletski.task06.service.impl.exception.ConeServiceException;

public class Runner {

    /**
     * Разработать классы Точка и Конус. Создать методы и тесты: вычисления площади
     * поверхности фигуры и ее объема, а также соотношения объемов получаемых в результате
     * рассечения фигуры координатной плоскостью; является ли объект заданной фигурой;
     * находится ли основание фигуры на одной из координатных плоскостей.
     */

    public static void main(String[] args) {
        System.out.println("Hello there!");
        ConeVolumeService coneVolumeService = new ConeVolumeServiceImpl();
        IsConeValidService isConeValidService = new IsConeValidServiceImpl();
        IsConeBaseService isConeBaseService = new IsConeBaseServiceImpl();
        ConeDissectionService coneDissectionService = new ConeDissectionServiceImpl();

        Cone cone = new Cone(new Cone.Point(0,0,0),
                new Cone.Point(10, 10, 0),
                new Cone.Point(10, 10, 0),
                new Cone.Point(0,0,25));

        try {
            System.out.println(coneDissectionService.getDissectionProportion(cone, new Cone.Point(0, 0, 7)));
        } catch (ConeServiceException e) {
            e.printStackTrace();
        }
    }
}
