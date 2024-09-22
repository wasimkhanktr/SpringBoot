package com.project.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.main.entities.Student;
import com.project.main.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentServices {

	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public boolean addStudentdetail(Student std) {
		
		boolean status=false;
		try {
			studentRepository.save(std);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return false;
	}

	@Override
	public List<Student> getAllStudentDetails() {
		
		return studentRepository.findAll();
	}

}
