package com.project.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

}
