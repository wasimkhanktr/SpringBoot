package com.project.main.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Student getStudentdetail(Long id) {
		
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}

	@Override
	public boolean updateStudentdetails(long id, float marks) {
		Student std = getStudentdetail(id);
		if(std != null)
		{
			std.setMarks(marks);
			studentRepository.save(std);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean deleteStudentdetails(long id) {
		boolean status=false;
		try {
			studentRepository.deleteById(id);
			status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		
		return status;
	}

}
