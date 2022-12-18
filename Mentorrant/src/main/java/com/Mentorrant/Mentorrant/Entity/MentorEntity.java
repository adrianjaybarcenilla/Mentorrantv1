package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_mentor", schema ="db_mentorrant")
public class MentorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mentorId")
	private int mentorId;
	
	@Column(name = "studentId")
	private int studentId;
	
	@Column(name = "rating")
	private double rating;
	
	@Column(name = "courseId")
	private int courseId;
	
	public MentorEntity() {}

	public MentorEntity(int mentorId, int studentId, double rating, int courseId) {
		super();
		this.mentorId = mentorId;
		this.studentId = studentId;
		this.rating = rating;
		this.courseId = courseId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
}