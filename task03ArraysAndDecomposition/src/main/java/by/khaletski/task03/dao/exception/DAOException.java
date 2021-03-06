package by.khaletski.task03.dao.exception;

public class DAOException extends Exception {
    public DAOException() {
    }

    public DAOException(final String message) {
        super(message);
    }

    public DAOException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DAOException(final Throwable cause) {
        super(cause);
    }
}
