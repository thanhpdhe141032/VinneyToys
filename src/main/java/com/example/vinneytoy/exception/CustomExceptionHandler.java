package com.example.vinneytoy.exception;

import com.example.vinneytoy.constant.ResponseCode;
import com.example.vinneytoy.constant.ResponseMessage;
import com.example.vinneytoy.models.Meta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<?> handlerDuplicateRecordException(DuplicateException ex) {
        // Log err
        Meta err = new Meta(ResponseCode.CODE_BAD_REQUEST, ResponseMessage.MESSAGE_FAIL);
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> handlerBadRequestException(BadRequestException ex) {
        //log err
        Meta err = new Meta(ResponseCode.CODE_OK, ResponseMessage.MESSAGE_FAIL);
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
