package com.Mentorrant.Mentorrant.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studrepo;
	
	
}
