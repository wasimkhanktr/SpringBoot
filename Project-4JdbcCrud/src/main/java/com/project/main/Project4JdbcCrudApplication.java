package com.project.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.main.dao.UserDao;
import com.project.main.entities.User;

@SpringBootApplication
public class Project4JdbcCrudApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(Project4JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		----------------------jdbc insertion---------------------
//		User user1=new User("Wasim","wasim@gmail.com","Male","Katihar");
//		
//		boolean status = userDao.insertUser(user1);
//		if(status)
//			System.out.println("user inserted successfully..");
//		else
//			System.err.println("User inserting failled..");
		
//		---------------------jdbc update--------------------
		
		User user2=new User("Akram","wasim@gmail.com","Male","Delhi");
		boolean status = userDao.updateUser(user2);
		if(status)
			System.out.println("user update successfully..");
		else
			System.err.println("User update failled..");
		
	}

}
