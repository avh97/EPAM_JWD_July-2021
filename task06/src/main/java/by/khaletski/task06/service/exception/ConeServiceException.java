package by.khaletski.task06.service.exception;

public class ConeServiceException extends Exception {
    public ConeServiceException() {
    }

    public ConeServiceException(final String message) {
        super(message);
    }

    public ConeServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ConeServiceException(final Throwable cause) {
        super(cause);
    }
}
