package com.daimler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.daimler.service.BusinessServiceImpl;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler
    public ResponseEntity<CustomExceptionResponse> handleException(RecordNotFoundException ine){
		LOGGER.error("CustomServiceExceptionAdvice ---->  NOT_FOUND");
        CustomExceptionResponse errorResponse = new CustomExceptionResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(ine.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<CustomExceptionResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomExceptionResponse> handleException(Exception ex){
    	LOGGER.error("CustomServiceExceptionAdvice ---->  BAD_REQUEST");
        CustomExceptionResponse errorResponse = new CustomExceptionResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<CustomExceptionResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
    
}
