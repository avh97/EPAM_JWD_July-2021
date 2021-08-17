package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;

public class BubbleSortService implements by.khaletski.task03.service.SortService {

    @Override
    public NumberArray sort(NumberArray numberArray) {
        int[] array = numberArray.getArray();
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return new NumberArray(array);
    }
}
