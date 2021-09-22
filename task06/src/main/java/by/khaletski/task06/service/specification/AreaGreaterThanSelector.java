package by.khaletski.task06.service.specification;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class AreaGreaterThanSelector extends AbstractSelector<Cone>{
    private double area;

    public AreaGreaterThanSelector(double newArea) {
        area = newArea;
    }

    @Override
    public boolean test(Cone cone) {
        try {
            return area < ServiceFactory.getInstance().getConeAreaService().getConeArea(cone);
        } catch (ConeServiceException e) {
            return false;
        }
    }
}
