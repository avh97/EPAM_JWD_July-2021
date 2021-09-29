package by.khaletski.task06.service.specification;

public class NotSelector<T> extends AbstractSelector<T> {

    private final AbstractSelector<T> component;

    NotSelector(final AbstractSelector<T> selector) {
        this.component = selector;
    }

    @Override
    public final boolean test(final T t) {
        return !(component.test(t));
    }
}
