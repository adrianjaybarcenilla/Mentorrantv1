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

import com.Mentorrant.Mentorrant.Entity.CourseEntity;
import com.Mentorrant.Mentorrant.Service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController{
	
	@Autowired
	CourseService cserv;
	
	@PostMapping("/postCourse")
	public CourseEntity addCourse(@RequestBody CourseEntity course) {
		return cserv.addCourse(course);
	}

	@GetMapping("/getAllCourse")
	public List<CourseEntity>getAllCourse(){
		return cserv.getAllCourse();
	}
	
	@GetMapping("/getByCourseCode")
	public CourseEntity findByCourseCode(@RequestParam String courseCode) {
		return cserv.findByCourseCode(courseCode);
	}
	
	@GetMapping("/getByCourseDescription")
	public CourseEntity findByCourseDescription(@RequestParam String courseDescription) {
		return cserv.findByCourseDescription(courseDescription);
	}

	@PutMapping("/updateCourse")
	public CourseEntity update(@RequestParam int id , @RequestBody CourseEntity newCourse) throws Exception{
		return cserv.updateCourse(id, newCourse);
	}
	
	@DeleteMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		return cserv.deleteCourse(id);
	}
}