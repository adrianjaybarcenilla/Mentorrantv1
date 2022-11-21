package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "tbl_student")

public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StudentId;
	
	@Column(name = "FirstName", length = , precision = 0)
	private String FirstName;
	
	@Column(name = "LastName", length = 50, precision = 0)
	private String LastName;
	
	@Column(name = "Program", length = 50, precision = 0)
	private String Program;
	
	@Column(name = "Year", precision = 0)
	private int Year;

	public StudentEntity(int studentId, String firstName, String lastName, String program, int year) {
		super();
		StudentId = studentId;
		FirstName = firstName;
		LastName = lastName;
		Program = program;
		Year = year;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
	
}
