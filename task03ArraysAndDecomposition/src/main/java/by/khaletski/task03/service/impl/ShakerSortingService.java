package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;

public class ShakerSortingService implements by.khaletski.task03.service.ShakerSortingService {

    @Override
    public NumberArray shakerSort(NumberArray numberArray) {
        int[] array = numberArray.getArray();
        int tempVariable;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    tempVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempVariable;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    tempVariable = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tempVariable;
                }
            }
            left++;
        } while (left < right);
        return new NumberArray(array);
    }
}
