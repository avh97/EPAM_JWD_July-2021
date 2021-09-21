package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SpecificationFilterServiceImpl {
    public Map<Integer, Cone> filter(Map<Integer, Cone> map, Predicate<Cone> selector) {
        return (map.entrySet().stream().filter(s -> selector.test(s.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}
