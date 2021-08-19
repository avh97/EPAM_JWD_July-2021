package by.khaletski.task03.entity.exception;

public class NumberArrayException extends Exception {
    public NumberArrayException() {
    }

    public NumberArrayException(final String message) {
        super(message);
    }

    public NumberArrayException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NumberArrayException(final Throwable cause) {
        super(cause);
    }
}
