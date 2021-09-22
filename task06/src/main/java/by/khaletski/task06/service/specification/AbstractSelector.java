package by.khaletski.task06.service.specification;

import java.util.function.Predicate;

public abstract class AbstractSelector<T> implements Predicate<T> {

    public AbstractSelector<T> and(AbstractSelector<T> other) {
        return new AndSelector<>(this, other);
    }

    public AbstractSelector<T> or(AbstractSelector<T> other) {
        return new OrSelector<>(this, other);
    }

    public AbstractSelector<T> not() {
        return new NotSelector<>(this);
    }
}


