package by.khaletski.task03.service.exception;

public class MatrixServiceException extends Exception {
    public MatrixServiceException() {
    }

    public MatrixServiceException(final String message) {
        super(message);
    }

    public MatrixServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MatrixServiceException(final Throwable cause) {
        super(cause);
    }
}
