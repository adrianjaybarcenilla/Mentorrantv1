package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mentorrant.Mentorrant.Entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{
	CourseEntity findByCourseCode(String CourseCode);
	CourseEntity findByCourseDescription(String CourseDescription);
}
