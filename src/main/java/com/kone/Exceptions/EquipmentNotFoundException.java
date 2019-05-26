package com.kone.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EquipmentNotFoundException extends RuntimeException {
    public EquipmentNotFoundException(String message) {
        super(message);
    }
}
