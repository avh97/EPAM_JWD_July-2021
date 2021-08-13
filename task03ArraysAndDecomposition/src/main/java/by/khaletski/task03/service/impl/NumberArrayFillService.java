package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;

public class NumberArrayFillService implements by.khaletski.task03.service.NumberArrayFillService {

    @Override
    public NumberArray fillRandomized(NumberArray numberArray, int minValue, int maxValue) {
        int[] array = numberArray.getArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        }
        return new NumberArray(array);
    }
}
