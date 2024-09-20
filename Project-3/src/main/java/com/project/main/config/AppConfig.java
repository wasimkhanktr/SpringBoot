package com.project.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.main.beans.Student;

@Configuration
public class AppConfig
{
	@Bean
	public CommandLineRunner commandLineRunner()
	{
		return new CommandLineRunner() {
					@Override
					public void run(String... args) throws Exception {
						studentBean1().displayStudentDetails();
						System.out.println("-------------------------");
						studentBean2().displayStudentDetails();
						
					}
		
		};
	}
	
	
	@Bean
	public Student studentBean1()
	{
		return new Student(1, "Wasim", 90);
	}
	@Bean
	public Student studentBean2()
	{
		return new Student(2, "Akram", 92);
	}

}
