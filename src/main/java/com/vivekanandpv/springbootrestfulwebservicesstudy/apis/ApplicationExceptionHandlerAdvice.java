package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApplicationExceptionHandlerAdvice {
    //  These handlers are activated when controllers are unable to handle
    //  Application-wide exception handling strategy should be implemented here

    @ExceptionHandler(value = {IllegalArgumentException.class})
    //  Parameter type has to be a superclass, because of multiple types in value
    public ResponseEntity<?> handleIllegalArgumentException(RuntimeException exception, WebRequest request) {
        return ResponseEntity.status(400).body(String.format("ControllerAdvice: %s for url: %s", exception.getMessage(), request.getDescription(true)));
    }

    @ExceptionHandler
    //  WebRequest is optional; if value is absent, parameter type decides the handler
    public ResponseEntity<?> handleThrowable(Throwable exception, WebRequest request) {
        return ResponseEntity.status(400).body(String.format("ControllerAdvice: %s for url: %s", exception.getMessage(), request.getDescription(true)));
    }
}
