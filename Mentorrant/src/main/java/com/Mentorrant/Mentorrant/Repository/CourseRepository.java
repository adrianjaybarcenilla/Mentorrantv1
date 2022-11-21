package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mentorrant.Mentorrant.Entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{
	CourseEntity findCourseCode(String CourseCode);
	CourseEntity findCourseDescription(String CourseDescription);
}
