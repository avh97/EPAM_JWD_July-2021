package by.khaletski.task06.service.specification;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;

public class AreaGreaterThanSelector extends AbstractSelector<Cone> {
    private double area;

    public AreaGreaterThanSelector(final double newArea) {
        area = newArea;
    }

    @Override
    public final boolean test(final Cone cone) {
        try {
            return area < ServiceFactory.getInstance().getConeAreaService().calculate(cone);
        } catch (ConeServiceException e) {
            return false;
        }
    }
}
