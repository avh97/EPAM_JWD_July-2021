package by.khaletski.task06.dao.repository;

import by.khaletski.task06.dao.files.TextFileReader;
import by.khaletski.task06.entity.Cone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class RepositoryImpl implements Repository {
    static final Logger LOGGER = LogManager.getLogger(RepositoryImpl.class);

    private static final RepositoryImpl INSTANCE = new RepositoryImpl();
    private Map<Integer, Cone> storage = TextFileReader.getInstance().read();

    public static RepositoryImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public final Cone getElement(final int index) {
        if (storage.get(index) == null) {
            LOGGER.info("There is no such element in read.");
        }
        return storage.get(index);
    }

    @Override
    public final void replaceElement(final int index, final Cone cone) {
        if (storage.containsKey(index)) {
            storage.put(index, cone);
        } else {
            LOGGER.info("Element has not been replaced. There is no such element in read.");
        }
    }

    @Override
    public final void addElement(final int index, final Cone cone) {
        if (!storage.containsKey(index)) {
            storage.put(index, cone);
        } else {
            LOGGER.info("Element with this index already exists in read.");
        }
    }

    @Override
    public final void deleteElement(final int index) {
        if (storage.containsKey(index)) {
            storage.remove(index);
        } else {
            LOGGER.info("Element has not been deleted. There is no such element in read.");
        }
    }
}
