package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_mentor", schema ="db_mentorrant")
public class MentorEntity {
	
	@Id
	@Column(name = "mentorId", precision = 0)
	private int mentorId;
	
	@Column(name = "studentId", precision = 0)
	private int studentId;
	
	@Column(name = "name", length = 50, precision = 0)
	private String name;
	
	@Column(name = "rating", precision = 0)
	private int rating;
	
	@Column(name = "courseId", precision = 0)
	private int courseId;
	
	public MentorEntity() {
		super();
	}

	public MentorEntity(int mentorId, int studentId, String name, int rating, int courseId) {
		super();
		this.mentorId = mentorId;
		this.studentId = studentId;
		this.name = name;
		this.rating = rating;
		this.courseId = courseId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId){
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
}