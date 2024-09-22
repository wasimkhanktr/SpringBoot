package com.project.main.services;

import java.util.List;

import com.project.main.entities.Student;

public interface StudentServices 
{
	public boolean addStudentdetail(Student std);
	public List<Student> getAllStudentDetails();
	public Student getStudentdetail(Long id);

}
