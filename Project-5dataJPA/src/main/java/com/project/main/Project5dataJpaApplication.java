package com.project.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.main.entities.Student;
import com.project.main.services.StudentServiceImp;
import com.project.main.services.StudentServices;

@SpringBootApplication
public class Project5dataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Project5dataJpaApplication.class, args);
		StudentServices stdsevice = context.getBean(StudentServiceImp.class);

//        ----------------insert---------operation-----------
//        
//        Student std = new Student();
//        std.setName("Wasim");
//        std.setRollNo(101);
//        std.setMarks(86.5f);
//        
//        boolean status = stdsevice.addStudentdetail(std);
//        
//        if (status)
//            System.out.println("Student inserted successfully");
//        else
//            System.out.println("Student insertion failed");

//        ---------------display--all--details-------------------
//        List<Student> list = stdsevice.getAllStudentDetails();
//        
//        for(Student std:list)
//        {
//        	System.out.println("id : " + std.getId());
//        	System.out.println("Name : "+std.getName());
//        	System.out.println("Roll No. : "+std.getRollNo());
//        	System.out.println("Marsk : "+std.getMarks());
//        	System.out.println("-------------------------");
//        }

//        ---------------display--all--details-------------------
//		Student std = stdsevice.getStudentdetail(1l);
//
//		System.out.println("id : " + std.getId());
//		System.out.println("Name : " + std.getName());
//		System.out.println("Roll No. : " + std.getRollNo());
//		System.out.println("Marsk : " + std.getMarks());
		
//		--------------update marks------------------
		boolean status = stdsevice.updateStudentdetails(1l, 98.7f);
		
		if(status)
			System.out.println("Updeted successfully...");
		else
			System.out.println("Updetion failled...");
			

	}

}
