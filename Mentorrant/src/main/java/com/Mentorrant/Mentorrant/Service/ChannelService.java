package com.Mentorrant.Mentorrant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.ChannelEntity;
import com.Mentorrant.Mentorrant.Repository.ChannelRepository;

@Service
public class ChannelService {
	@Autowired
	ChannelRepository crepo;
	
	public ChannelEntity addChannel(ChannelEntity channel) {
		return crepo.save(channel);
	}
	
	public List<ChannelEntity>getAllChannel(){
		return crepo.findAll();
	}
	
	public ChannelEntity findByChannelNumber(String channelNumber) {
		if(crepo.findChannelByChannelNumber(channelNumber) != null) {
			return crepo.findChannelByChannelNumber(channelNumber);
		}else {
			return null;
		}
	}
	
	
	public String deleteChannel(int channelId) {
		String msg;
		
		if(crepo.findById(channelId) != null) {
			crepo.deleteById(channelId);
			
			msg = "Channel Id Number " + channelId + " has been successfully deleted";
		} else {
			msg = "Channel Id number " + channelId + " is not found!";
		}
		return msg;	
	}
}
