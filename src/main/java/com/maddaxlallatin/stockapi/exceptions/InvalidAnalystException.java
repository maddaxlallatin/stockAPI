package com.maddaxlallatin.stockapi.exceptions;

public class InvalidAnalystException extends  RuntimeException{
    public InvalidAnalystException(String message) {
        super(message);
    }

    public InvalidAnalystException(String message, Throwable cause){
        super(message, cause);
    }
}
