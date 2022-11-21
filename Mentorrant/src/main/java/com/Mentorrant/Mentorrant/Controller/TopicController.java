package com.Mentorrant.Mentorrant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Mentorrant.Mentorrant.Entity.TopicEntity;
import com.Mentorrant.Mentorrant.Service.TopicService;

@Service
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	TopicService topicserv;
	
	@PostMapping("/postTopic")
	public TopicEntity addTopic(@RequestBody TopicEntity topic) {
		return topicserv.addTopic(topic);
	}

	@GetMapping("/get")
	public List<TopicEntity>getAllTopic(){
		return topicserv.getAllTopic();
	}
	
	@GetMapping("/getBySubject")
	public TopicEntity findbySubject(@RequestParam String subject) {
		return topicserv.findbySubject(subject);
	}

	@PutMapping("/UpdateTopic")
	public TopicEntity updateTopic(@RequestParam int id , @RequestBody TopicEntity newEbook) throws Exception{
		return topicserv.updateMentee(id, newEbook);
	}
	
	@DeleteMapping("/DeleteTopic/{id}")
	public String deleteMentee(@PathVariable int id) {
		return topicserv.deleteMentee(id);
	}
}
