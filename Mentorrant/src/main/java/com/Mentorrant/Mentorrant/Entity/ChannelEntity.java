package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_channel")
public class ChannelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int channelId;
	
	@Column(name = "channelNumber")
	private String channelNumber;
	
	public ChannelEntity() {};

	public ChannelEntity(int channelId, String channelNumber) {
		super();
		this.channelId = channelId;
		this.channelNumber = channelNumber;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelNumber() {
		return channelNumber;
	}

	public void setChannelNumber(String channelNumber) {
		this.channelNumber = channelNumber;
	}
	
}
