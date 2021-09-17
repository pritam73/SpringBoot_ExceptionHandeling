package com.demo.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.exception.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/userList")
	public ResponseEntity<?> userList() {
		System.err.println("::: UserController.userList :::");
		return new ResponseEntity<>(userService.userList(), HttpStatus.OK);
	}

	@GetMapping("/userById/{id}")
	public ResponseEntity<?> userById(@PathVariable("id") Long id) {
		System.err.println("::: UserController.userById :::");
		return new ResponseEntity<>(userService.userById(id), HttpStatus.OK);
	}

	@GetMapping("/")
	public String index(final Model model) {
		System.err.println("::: UserController.index :::");
		model.addAttribute("title", "Docker With Spring Boot");
		model.addAttribute("msg", "Welcome to the docker container!");
		return "index";
	}
}
