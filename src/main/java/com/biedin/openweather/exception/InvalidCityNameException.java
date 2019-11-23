package com.biedin.openweather.exception;

/**
 * @author Ihor Biedin 21.11.2019
 */

public class InvalidCityNameException extends Exception {

    public InvalidCityNameException() {
        super();
    }

    public InvalidCityNameException(String message) {
        super(message);
    }

    public InvalidCityNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCityNameException(Throwable cause) {
        super(cause);
    }
}
