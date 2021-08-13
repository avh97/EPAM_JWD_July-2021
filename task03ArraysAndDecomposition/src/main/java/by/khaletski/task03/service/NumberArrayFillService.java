package by.khaletski.task03.service;

import by.khaletski.task03.entity.NumberArray;

public interface NumberArrayFillService {
    NumberArray fillRandomized(NumberArray numberArray, int minValue, int maxValue);
}
