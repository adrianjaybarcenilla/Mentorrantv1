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
	@Column(name = "topicId", length = 50, precision = 0)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topicId;
	
	@Column(name = "subject", length = 50, precision = 0)
	private String subject;

	public TopicEntity() {}
	
	public TopicEntity(int topicId, String subject) {
		super();
		this.topicId = topicId;
		this.subject = subject;
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
}