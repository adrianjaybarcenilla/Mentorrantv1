package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "tbl_student")

public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
	private AccountEntity account;

	@Column(name = "firstName", length = 50, precision = 0)
	private String firstName;
	
	@Column(name = "lastName", length = 50, precision = 0)
	private String lastName;
	
	@Column(name = "program", length = 50, precision = 0)
	private String program;
	
	@Column(name = "year", precision = 0)
	private int year;
	
	public StudentEntity() {}

	public StudentEntity(int studentId, AccountEntity account, String firstName, String lastName, String program, int year) {
		super();
		this.studentId = studentId;
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.program = program;
		this.year = year;
	}

	public int getStudentId() {
		return studentId;
	}
	
	public AccountEntity getaccount() {
		return account;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
