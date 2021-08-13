package by.khaletski.task03.entity.exception;

public class NumberArrayException extends Exception {
    public NumberArrayException() {
    }

    public NumberArrayException(String message) {
        super(message);
    }

    public NumberArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberArrayException(Throwable cause) {
        super(cause);
    }
}
