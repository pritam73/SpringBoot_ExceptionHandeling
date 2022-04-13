package com.demo.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.handler.UserNotFoundException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(UserNotFoundException.class)
	public String exceptionHandle(UserNotFoundException ex) {
		return "error";
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<?> exceptionHandle(IllegalArgumentException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
