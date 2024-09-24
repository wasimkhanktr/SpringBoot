package com.project.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.entities.User;


public interface UserRepository extends JpaRepository<User, Long> 
{

}