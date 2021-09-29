package by.khaletski.task06.service.specification;

import java.util.List;

public class OrSelector<T> extends AbstractSelector<T> {

    private final List<AbstractSelector<T>> leafComponents;

    @SafeVarargs
    OrSelector(final AbstractSelector<T>... selectors) {
        this.leafComponents = List.of(selectors);
    }

    @Override
    public final boolean test(final T t) {
        return leafComponents.stream().anyMatch(comp -> comp.test(t));
    }
}
