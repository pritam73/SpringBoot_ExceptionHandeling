package com.demo.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.handler.UserNotFoundException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> exceptionHandle(UserNotFoundException ex) {
		return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
	}

}
