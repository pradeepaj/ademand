package com.hcl.demand.supply.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler extends RuntimeException {
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(value = { UserNotFoundException.class })

	public ResponseEntity<ResponseError> UserNotFoundException(Exception e) {

		ResponseError error = new ResponseError(e.getMessage(), HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}

}
