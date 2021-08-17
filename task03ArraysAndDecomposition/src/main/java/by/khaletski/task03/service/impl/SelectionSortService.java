package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;

public class SelectionSortService implements by.khaletski.task03.service.SortService {

    @Override
    public NumberArray sort(NumberArray numberArray) {
        int[] array = numberArray.getArray();
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
        return new NumberArray(array);
    }
}
