package by.khaletski.task03.entity;

import by.khaletski.task03.entity.exception.NumberArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class NumberArray {
    private int[] array;
    private int size; //TODO Delete



    static final Logger LOGGER = LogManager.getLogger(NumberArray.class);

    public NumberArray(final int[] array) {
        this.array = array;
        size = array.length;
        LOGGER.debug("NumberArray has been successfully created.");
    }

    public NumberArray(final int size) throws NumberArrayException {
        if (size < 0) {
            LOGGER.error("NumberArray has not been successfully created.");
            throw new NumberArrayException();
        }
//        this.size = size;
        array = new int[size];
        LOGGER.debug("NumberArray has been successfully created.");
    }

    public final int[] getArray() {
        return array;
    }

    @Override
    public final String toString() {
        return "Sorted array = " + Arrays.toString(array) + ", size = " + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberArray that = (NumberArray) o;
        return size == that.size && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
