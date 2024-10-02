package com.dbxml.dbxml.controller;

import com.dbxml.dbxml.config.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalErrorHandler implements ErrorController {


    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> nullError(NullPointerException error) {
        Map<String, String> map = new HashMap<>();
        map.put("Msg ", error.getLocalizedMessage());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> customException(CustomException error) {
        Map<String, String> map = new HashMap<>();
        map.put("Msg ", error.getLocalizedMessage());
        return new ResponseEntity<>(map, HttpStatus.TOO_MANY_REQUESTS);
    }

}
