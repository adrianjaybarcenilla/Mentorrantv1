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
@Table(name = "tbl_mentee", schema ="db_mentorrant")
public class MenteeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menteeId", length = 50, precision = 0)
	private int menteeId;
	
	@Column(name = "studentId")
	private int studentId;
	
	@Column(name = "courseId")
	private int courseId;
	
	public MenteeEntity() {}

	public MenteeEntity(int menteeId, int studentId, int courseId) {
		super();
		this.menteeId = menteeId;
		this.studentId = studentId;
		this.courseId = courseId;
	}

	public int getMenteeId() {
		return menteeId;
	}

	public void setMenteeId(int menteeId) {
		this.menteeId = menteeId;
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

	 
}
