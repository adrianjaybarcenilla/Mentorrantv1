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
	@Column(name = "studentid", length = 50, precision = 0)
	private int studentid;
	
	@Column(name = "name", length = 50, precision = 0)
	private String name;

	@Column(name = "courseid", length = 50, precision = 0)
	private int courseid;
	
	public MenteeEntity() {}

	public MenteeEntity(int studentid, String name, int courseid) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.courseid = courseid;
	}

	public int getStudentId() {
		return studentid;
	}

	public void setStudentId(int studentId) {
		this.studentid = studentId;
	}

	public int getCourseId() {
		return courseid;
	}

	public void setCourseId(int courseId) {
		this.courseid = courseId;
	}

	public String getName() {
		return name;
	}
}
