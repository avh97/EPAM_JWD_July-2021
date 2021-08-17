package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;

public class ShellSortService implements by.khaletski.task03.service.SortService {

    @Override
    public NumberArray sort(NumberArray numberArray) {
        int[] mass = numberArray.getArray();
        int i, j;
        int tmp;
        for (int step = mass.length / 2; step > 0; step /= 2)
            for (i = step; i < mass.length; i++) {
                tmp = mass[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < mass[j - step])
                        mass[j] = mass[j - step];
                    else
                        break;
                }
                mass[j] = tmp;
            }
        return new NumberArray(mass);
    }
}
