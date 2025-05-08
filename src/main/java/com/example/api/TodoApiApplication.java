package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class TodoApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoApiApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> defaultRoute() {
		String routes = "Olá Dev";
		return ResponseEntity.ok(routes);
	}






}