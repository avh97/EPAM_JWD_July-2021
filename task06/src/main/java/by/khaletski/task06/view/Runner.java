package by.khaletski.task06.view;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.IsConeBaseService;
import by.khaletski.task06.service.IsConeValidService;
import by.khaletski.task06.service.impl.IsConeBaseServiceImpl;
import by.khaletski.task06.service.impl.IsConeValidServiceImpl;

public class Runner {

    /**
     * Разработать классы Точка и Конус. Создать методы и тесты: вычисления площади
     * поверхности фигуры и ее объема, а также соотношения объемов получаемых в результате
     * рассечения фигуры координатной плоскостью; является ли объект заданной фигурой;
     * находится ли основание фигуры на одной из координатных плоскостей.
     */

    public static void main(String[] args) {
        System.out.println("Hello there!");
        IsConeValidService isConeValidService = new IsConeValidServiceImpl();
        IsConeBaseService isConeBaseService = new IsConeBaseServiceImpl();
        Cone cone = new Cone(new Cone.Point(0,0,0),
                new Cone.Point(5, 5, 0),
                new Cone.Point(0, 0, 0),
                new Cone.Point(0,0,15));
        System.out.println(isConeValidService.isConeValid(cone));
        System.out.println(isConeBaseService.isConeBase(cone));
    }
}
