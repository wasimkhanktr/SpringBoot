package com.project.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.main.entities.User;
import com.project.main.repository.UserRepository;

@Service
public class UserServiceImp implements UserService
{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(User user) {
		

		boolean status=false;
		try {
			userRepository.save(user);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
	}

}
