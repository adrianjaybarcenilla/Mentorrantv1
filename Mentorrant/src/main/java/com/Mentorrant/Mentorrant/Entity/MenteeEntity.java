package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_mentee", schema ="db_mentorrant")
public class MenteeEntity {
	
	@Id
	@Column(name = "code", length = 50, precision = 0)
	private int StudentId;
	
	@Column(name = "code", length = 50, precision = 0)
	private int CourseId;
	
	@Column(name = "code", length = 50, precision = 0)
	private String Name;

	public MenteeEntity(int studentId, int courseId, String name) {
		super();
		StudentId = studentId;
		CourseId = courseId;
		Name = name;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
