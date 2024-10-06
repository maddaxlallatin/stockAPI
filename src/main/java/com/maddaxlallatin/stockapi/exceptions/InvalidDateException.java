package com.maddaxlallatin.stockapi.exceptions;

public class InvalidDateException extends RuntimeException{

    public InvalidDateException(String message) {
        super(message);
    }

    public InvalidDateException(String message, Throwable cause){
        super(message, cause);
    }

}
