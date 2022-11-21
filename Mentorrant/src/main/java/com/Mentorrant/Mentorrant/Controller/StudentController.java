package com.Mentorrant.Mentorrant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mentorrant.Mentorrant.Entity.StudentEntity;
import com.Mentorrant.Mentorrant.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService studserve;
	
	@PostMapping("/postStudent")
	public StudentEntity addEbook(@RequestBody StudentEntity student) {
		return studserve.addStudent(student);
	}

	@GetMapping("/getAllStudents")
	public List<StudentEntity>getAllStudents(){
		return studserve.getAllStudent();
	}
	
	@GetMapping("/findByFirstName")
	public StudentEntity findByFirstName(@RequestParam String firstName) {
		return studserve.findByFirstName(firstName);
	}
	
	@GetMapping("/findByLastName")
	public StudentEntity findByLastName(@RequestParam String lastName) {
		return studserve.findByLastName(lastName);
	}
	
	@PutMapping("/updateStudent")
	public StudentEntity updateStudent(@RequestParam int studentId , @RequestBody StudentEntity newStudent) throws Exception{
		return studserve.updateStudent(studentId, newStudent);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int studentId) {
		return studserve.deleteStudent(studentId);
	}
}