package com.project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		System.out.println("Spring start....");
		SpringApplication.run(ProjectApplication.class, args);
		System.out.println("Spring end....");
	}

}
