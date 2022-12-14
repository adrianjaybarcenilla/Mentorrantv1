package com.Mentorrant.Mentorrant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mentorrant.Mentorrant.Entity.ChannelEntity;
import com.Mentorrant.Mentorrant.Service.ChannelService;

@RestController
@RequestMapping("/channel")
public class ChannelController {
	@Autowired
	ChannelService chserv;
	
	@CrossOrigin
	@PostMapping("/postChannel")
	public ChannelEntity addChannel(@RequestBody ChannelEntity channel) {
		return chserv.addChannel(channel);
	}

	@CrossOrigin
	@GetMapping("/getAllChannel")
	public List<ChannelEntity>getAllChannel(){
		return chserv.getAllChannel();
	}
	
	@CrossOrigin
	@GetMapping("/getByChannelNumber")
	public ChannelEntity findChannelByChannelNumber(@RequestParam String channelNumber) {
		return chserv.findByChannelNumber(channelNumber);
	}
	
	@CrossOrigin
	@DeleteMapping("/DeleteChannel/{channelId}")
	public String deleteChannel(@PathVariable int channelId) {
		return chserv.deleteChannel(channelId);
	}
}
