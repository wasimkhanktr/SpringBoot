package com.project.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project2Application  implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		myClass().printMessege("wasim");
		
	}
	
	@Bean
	public MyClass myClass()
	{
		return new MyClass();
		
	}

}
