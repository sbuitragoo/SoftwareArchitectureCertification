package edu.unisabana.pizzafactory.exception;

public class InvalidSizeException extends Exception{
    public InvalidSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSizeException(String message) {
        super(message);
    }
}
