package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_topic", schema ="db_mentorrant")
public class TopicEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topicid", length = 50, precision = 0)
	private int topicId;
	
	@Column(name = "subject", length = 50, precision = 0)
	private String subject;
	
	@Column(name = "courseid", length = 50, precision = 0)
	private int courseid;
	
	public TopicEntity() {}

	public TopicEntity(int topicId, String subject, int courseid) {
		super();
		this.topicId = topicId;
		this.subject = subject;
		this.courseid = courseid;
	}

	public int getTopicId() {
		return topicId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCourseid() {
		return courseid;
	}

}
