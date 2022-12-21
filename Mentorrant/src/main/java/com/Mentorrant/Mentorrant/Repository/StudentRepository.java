package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity , Integer>{

	StudentEntity findByFirstName(String firstName);
	
	StudentEntity findByLastName(String lastName);
}