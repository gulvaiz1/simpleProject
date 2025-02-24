package com.example.simpleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleproject.service.StudentService;

@RestController
@RequestMapping("/api/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public ResponseEntity<String> getName(){
		String name = studentService.getStudentFullName();
		return new ResponseEntity<String>(name,HttpStatus.OK);
	}
}
