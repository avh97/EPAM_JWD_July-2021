package by.khaletski.task06.service.specification;

import java.util.function.Predicate;

public abstract class AbstractSelector<T> implements Predicate<T> {

    public final AbstractSelector<T> and(final AbstractSelector<T> other) {
        return new AndSelector<>(this, other);
    }

    public final AbstractSelector<T> or(final AbstractSelector<T> other) {
        return new OrSelector<>(this, other);
    }

    public final AbstractSelector<T> not() {
        return new NotSelector<>(this);
    }
}


