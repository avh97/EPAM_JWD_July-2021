package by.khaletski.task06.service.specification;

import java.util.List;

public class AndSelector<T> extends AbstractSelector<T> {

    private final List<AbstractSelector<T>> leafComponents;

    @SafeVarargs
    AndSelector(AbstractSelector<T>... selectors) {
        this.leafComponents = List.of(selectors);
    }

    @Override
    public boolean test(T t) {
        return leafComponents.stream().allMatch(comp -> (comp.test(t)));
    }
}
