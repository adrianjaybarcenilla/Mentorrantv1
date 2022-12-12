package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_course")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	
	@OneToOne(mappedBy = "course")
	private MenteeEntity mentee;
	
	@OneToOne(mappedBy = "course")
	private MentorEntity mentor;
	
	private String courseCode;
	private String courseDescription;
	
	public CourseEntity() {}
	
	public CourseEntity(int courseId, String courseCode, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseCode = courseCode;
		this.courseDescription = courseDescription;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getCourseDescription() {
		return courseDescription;
	}
	
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}	
}
