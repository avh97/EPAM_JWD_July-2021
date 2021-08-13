package by.khaletski.task03.entity;

import by.khaletski.task03.entity.exception.NumberArrayException;

import java.util.Arrays;

public class NumberArray {
    private int[] a;
    private int size;

    public NumberArray(int[] a) {
        this.a = a;
        size = a.length;
    }

    public NumberArray(int size) throws NumberArrayException {
        if (size < 0) {
            throw new NumberArrayException();
        }
        this.size = size;
        a = new int[size];
    }

    public int[] getArray() {
        return a;
    }

    @Override
    public String toString() {
        return "NumberArray{" +
                "a=" + Arrays.toString(a) +
                ", size=" + size +
                '}';
    }
}
