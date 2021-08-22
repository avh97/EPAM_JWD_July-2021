package by.khaletski.task03.entity;

import by.khaletski.task03.entity.exception.NumberArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class NumberArray {
    private int[] a;
    private int size;

    static final Logger LOGGER = LogManager.getLogger(NumberArray.class);

    public NumberArray(final int[] a) {
        this.a = a;
        size = a.length;
        LOGGER.debug("NumberArray has been successfully created.");
    }

    public NumberArray(final int size) throws NumberArrayException {
        if (size < 0) {
            LOGGER.error("NumberArray has not been successfully created.");
            throw new NumberArrayException();
        }
        this.size = size;
        a = new int[size];
        LOGGER.debug("NumberArray has been successfully created.");
    }

    public final int[] getArray() {
        return a;
    }

    @Override
    public final String toString() {
        return "Sorted array = " + Arrays.toString(a) + ", size = " + size;
    }
}
