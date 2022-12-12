package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_mentee", schema ="db_mentorrant")
public class MenteeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menteeId", length = 50, precision = 0)
	private int menteeId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentId", referencedColumnName = "studentId")
	private StudentEntity student;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
	private CourseEntity course;
	
	public MenteeEntity() {}

	public MenteeEntity(int menteeId, StudentEntity student, CourseEntity course) {
		super();
		this.menteeId = menteeId;
		this.student = student;
		this.course = course;
	}

	public int getMenteeId() {
		return menteeId;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public CourseEntity getCourse() {
		return course;
	}

	public void setCourse(CourseEntity course) {
		this.course = course;
	}
	
	
	
	
}
