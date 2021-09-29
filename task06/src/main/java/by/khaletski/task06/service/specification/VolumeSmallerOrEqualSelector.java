package by.khaletski.task06.service.specification;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.exception.ConeServiceException;
import by.khaletski.task06.service.factory.ServiceFactory;

public class VolumeSmallerOrEqualSelector extends AbstractSelector<Cone> {
    private double volume;

    public VolumeSmallerOrEqualSelector(final double newVolume) {
        volume = newVolume;
    }

    @Override
    public final boolean test(final Cone cone) {
        try {
            return volume >= ServiceFactory.getInstance().getConeVolumeService().calculate(cone);
        } catch (ConeServiceException e) {
            return false;
        }
    }
}
