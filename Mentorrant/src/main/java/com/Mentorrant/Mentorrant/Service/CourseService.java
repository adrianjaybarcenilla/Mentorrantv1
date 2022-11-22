package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.CourseEntity;
import com.Mentorrant.Mentorrant.Repository.CourseRepository;

@Service
public class CourseService{
	
	@Autowired
	CourseRepository crepo;
	
	public CourseEntity addCourse(CourseEntity course) {
		return crepo.save(course);
	}
	
	public List<CourseEntity>getAllCourse(){
		return crepo.findAll();
	}
	
	public CourseEntity findByCourseCode(String courseCode) {
		if(crepo.findByCourseCode(courseCode) != null) {
			return crepo.findByCourseCode(courseCode);
		}else {
			return null;
		}
	}

	public CourseEntity findByCourseDescription(String courseDescription) {
		if(crepo.findByCourseDescription(courseDescription) != null) {
			return crepo.findByCourseDescription(courseDescription);
		}else {
			return null;
		}
	}
	
	public CourseEntity updateCourse(int id, CourseEntity newCourse) throws Exception{
		CourseEntity course = new CourseEntity();
		
		try {
			course = crepo.findById(id).get();
			
			course.setCourseCode(newCourse.getCourseCode());
			course.setCourseDescription(newCourse.getCourseDescription());
			
			return crepo.save(course);
		} catch(NoSuchElementException next) {
			throw new Exception ("Course Id" + id + " Does Not Exist!");
		}
	}
	
	public String deleteCourse(int id) {
		String msg;
		
		if(crepo.findById(id) != null) {
			crepo.deleteById(id);
			
			msg = "Course Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Course Id number " + id + " is not found!";
		}
		return msg;	
	}
}