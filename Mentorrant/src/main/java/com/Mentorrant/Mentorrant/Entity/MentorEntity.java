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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mentorid")
	private int mentorid;
	
	private int studentid;
	private String name; 
	private double rating;
	private int courseid;
	
	public MentorEntity() {
		super();
	}

	public MentorEntity(int mentorid, int studentid, String name, int rating, int courseid) {
		super();
		this.mentorid = mentorid;
		this.studentid = studentid;
		this.name = name;
		this.rating = rating;
		this.courseid = courseid;
	}

	public int getMentorId() {
		return mentorid;
	}

	public int getStudentId() {
		return studentid;
	}

	public void setStudentId(int studentId){
		this.studentid = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double d) {
		this.rating = d;
	}

	public int getCourseId() {
		return courseid;
	}

	public void setCourseId(int courseId) {
		this.courseid = courseId;
	}
	
	
}