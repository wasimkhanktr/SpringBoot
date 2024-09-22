package com.project.main;

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
        
        Student std = new Student();
        std.setName("Wasim");
        std.setRollNo(101);
        std.setMarks(86.5f);
        
        boolean status = stdsevice.addStudentdetail(std);
        
        if (status)
            System.out.println("Student inserted successfully");
        else
            System.out.println("Student insertion failed");
    }

}
