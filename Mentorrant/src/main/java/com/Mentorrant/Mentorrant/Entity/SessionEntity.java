package com.Mentorrant.Mentorrant.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_session")
public class SessionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sessionId;
	private LocalDateTime dateTime;
	private String sessionDescription;
	
	public SessionEntity() {}
	
	public SessionEntity(int sessionId, LocalDateTime dateTime, String sessionDescription) {
		super();
		this.sessionId = sessionId;
		this.dateTime = dateTime;
		this.sessionDescription = sessionDescription;
	}

	public int getSessionId() {
		return sessionId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getSessionDescription() {
		return sessionDescription;
	}

	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}	
}
