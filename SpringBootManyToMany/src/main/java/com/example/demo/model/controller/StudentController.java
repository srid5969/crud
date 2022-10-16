package com.example.demo.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.service.StudentService;

@RestController
@RequestMapping
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student postStudentDetails(@RequestBody Student student) {
		return service.postmethod(student);
	}
	
	@GetMapping("/id/")
	public Optional<Student> getStudentByID(@RequestParam(name = "id") int id)
	{
		return service.getById(id);
	}
	
	
	@GetMapping("/get")
	public List<Student> getAllStudentDetail(){
		return service.getAllStudentDetails();
	}

}
