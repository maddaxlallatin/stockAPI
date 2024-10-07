package com.maddaxlallatin.stockapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {InvalidDateException.class})
    public ResponseEntity<Object> handleInvalidDateException(InvalidDateException e){
       ApiException apiException = new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")), 400);
       return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {InvalidNumberArticlesException.class})
    public ResponseEntity<Object> handleInvalidNumberArticlesException(InvalidNumberArticlesException e){
        ApiException apiException = new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")), 400);
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {InvalidAnalystException.class})
    public ResponseEntity<Object> handleInvalidAnalystException(InvalidAnalystException e){
        ApiException apiException = new ApiException(e.getMessage(), HttpStatus.NOT_FOUND, ZonedDateTime.now(ZoneId.of("Z")), 404);
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }
}
