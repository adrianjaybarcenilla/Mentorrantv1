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
	@Column(name = "studentId", length = 50, precision = 0)
	private int studentId;
	
	@Column(name = "courseId", length = 50, precision = 0)
	private int courseId;
	
	@Column(name = "name", length = 50, precision = 0)
	private String name;

	public MenteeEntity() {}

	public MenteeEntity(int studentId, int courseId, String name) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}
}
