package by.khaletski.task06.service.impl.specification;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.impl.exception.ConeServiceException;
import by.khaletski.task06.service.impl.factory.ServiceFactory;

public class VolumeGreaterThanSelector extends AbstractSelector<Cone>{
    private double volume;

    public VolumeGreaterThanSelector(double newVolume) {
        volume = newVolume;
    }

    @Override
    public boolean test(Cone cone) {
        try {
            return volume < ServiceFactory.getInstance().getConeVolumeService().getConeVolume(cone);
        } catch (ConeServiceException e) {
            return false;
        }
    }
}