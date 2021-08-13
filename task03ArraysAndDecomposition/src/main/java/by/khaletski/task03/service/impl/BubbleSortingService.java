package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;

public class BubbleSortingService implements by.khaletski.task03.service.BubbleSortingService {

    @Override
    public NumberArray bubbleSort(NumberArray numberArray) {
        int[] array = numberArray.getArray();
        boolean isSorted = false;
        int tempVariable;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    tempVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempVariable;
                }
            }
        }
        return new NumberArray(array);
    }
}
