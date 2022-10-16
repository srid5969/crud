package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.repository.StudentRepository;

@Service

public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public Student postmethod(Student student)
	{
		return repo.save(student);
	}
	
	public Optional<Student> getById(int id) {
		return repo.findById(id);
	}
	
	public List<Student> getAllStudentDetails(){
		return repo.findAll();
	}

}
