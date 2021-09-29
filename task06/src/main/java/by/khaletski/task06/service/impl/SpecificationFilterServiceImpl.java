package by.khaletski.task06.service.impl;

import by.khaletski.task06.entity.Cone;
import by.khaletski.task06.service.Specification;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SpecificationFilterServiceImpl implements Specification {
    @Override
    public final Map<Integer, Cone> find(final Map<Integer, Cone> map, final Predicate<Cone> selector) {
        return (map.entrySet().stream().filter(s -> selector.test(s.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}
