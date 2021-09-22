package by.khaletski.task06.service.specification;

import java.util.List;

public class OrSelector<T> extends AbstractSelector<T> {

    private final List<AbstractSelector<T>> leafComponents;

    @SafeVarargs
    OrSelector(AbstractSelector<T>... selectors) {
        this.leafComponents = List.of(selectors);
    }

    @Override
    public boolean test(T t) {
        return leafComponents.stream().anyMatch(comp -> comp.test(t));
    }
}
