package by.khaletski.task06.service.impl.specification;

public class NotSelector<T> extends AbstractSelector<T> {

    private final AbstractSelector<T> component;

    NotSelector(AbstractSelector<T> selector) {
        this.component = selector;
    }

    @Override
    public boolean test(T t) {
        return !(component.test(t));
    }
}
