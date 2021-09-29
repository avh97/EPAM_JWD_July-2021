package by.khaletski.task06.service;

import by.khaletski.task06.entity.Cone;

import java.util.Map;
import java.util.function.Predicate;

public interface Specification {
    Map<Integer, Cone> find(Map<Integer, Cone> map, Predicate<Cone> selector);
}
