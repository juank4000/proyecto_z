package cl.bci.common.exception;

public class SistemaException extends RuntimeException {

    /**
     * TODO Describir atributo serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    public SistemaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SistemaException(String message) {
        super(message);
    }
}
