package com.maddaxlallatin.stockapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.time.ZonedDateTime;

public class ApiException {
    private final ZonedDateTime timestamp;
    private final int status;
    private final HttpStatus error;
    private final String message;



    public ApiException(String message, HttpStatus httpStatus, ZonedDateTime timestamp, int status) {
        this.message = message;
        this.error = httpStatus;
        this.timestamp = timestamp;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public HttpStatus getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
