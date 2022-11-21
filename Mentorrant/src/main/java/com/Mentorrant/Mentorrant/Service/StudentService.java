package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.EbooksEntity;
import com.Mentorrant.Mentorrant.Entity.StudentEntity;
import com.Mentorrant.Mentorrant.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studrepo;
	
	public StudentEntity addStudent(StudentEntity student) {
		return studrepo.save(student);
	}
	
	public List<StudentEntity>getAllStudent(){
		return studrepo.findAll();
	}
	
	public StudentEntity findByFirstName(String firstName) {
		if(studrepo.findByFirstName(firstName) != null) {
			return studrepo.findByFirstName(firstName);
		}else {
			return null;
		}
	}
	
	public StudentEntity findByLastName(String lastName) {
		if(studrepo.findByLastName(lastName) != null) {
			return studrepo.findByLastName(lastName);			
		}else {
			return null;
		}
	}
	
	public StudentEntity updateStudent(int studentId , StudentEntity newStudent) throws Exception{
		StudentEntity student = new StudentEntity();
		
		try {
			student = studrepo.findById(studentId).get();
			
			student.setFirstName(newStudent.getFirstName());
			student.setLastName(newStudent.getLastName());
			student.setProgram(newStudent.getProgram());
			student.setYear(newStudent.getYear());
			
			return studrepo.save(student);
		} catch(NoSuchElementException next) {
			throw new Exception ("Student ID " + studentId + " Does Not Exist!");
		}
	}
	
	public String deleteStudent(int studentId) {
		String msg;
		
		if(studrepo.findById(studentId) != null) {
			studrepo.deleteById(studentId);
			
			msg = "Student Id Number " + studentId + " has been successfully deleted";
		} else {
			msg = "Student Id number " + studentId + " is not found!";
		}
		return msg;	
	}
}
