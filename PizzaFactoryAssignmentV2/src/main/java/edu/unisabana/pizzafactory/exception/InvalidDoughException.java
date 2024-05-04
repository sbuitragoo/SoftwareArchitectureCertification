package edu.unisabana.pizzafactory.exception;

public class InvalidDoughException extends Exception{
    public InvalidDoughException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDoughException(String message) {
        super(message);
    }
}
