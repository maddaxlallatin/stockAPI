package com.maddaxlallatin.stockapi.exceptions;

public class InvalidNumberArticlesException extends RuntimeException{

    public InvalidNumberArticlesException(String message) {
        super(message);
    }

    public InvalidNumberArticlesException(String message, Throwable cause){
        super(message, cause);
    }
}
