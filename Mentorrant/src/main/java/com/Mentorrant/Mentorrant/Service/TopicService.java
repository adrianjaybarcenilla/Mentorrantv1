package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.MenteeEntity;
import com.Mentorrant.Mentorrant.Entity.TopicEntity;
import com.Mentorrant.Mentorrant.Repository.TopicRepository;

@Service
public class TopicService {
	@Autowired
	TopicRepository mrepo;
	
	public TopicEntity addTopic(TopicEntity topic) {
		return mrepo.save(topic);
	}
	
	public List<TopicEntity> getAllMentee(){
		return mrepo.findAll();
	}
	
	public TopicEntity findbySubject(String subject) {
		if(mrepo.findBySubject(subject) != null) {
			return mrepo.findBySubject(subject);
		}else {
			return null;
		}
	}
	
	public TopicEntity updateMentee(int id,  TopicEntity newTopic) throws Exception{
		TopicEntity topic = new TopicEntity();
		
		try {
			topic = mrepo.findById(id).get();
			
			topic.setSubject(newTopic.getSubject());
			return mrepo.save(topic);
		} catch(NoSuchElementException next) {
			throw new Exception ("ID Number " + id + " Does Not Exist!");
		}
	}
	
	public String deleteMentee(int id) {
		String msg;
		
		if(mrepo.findById(id) != null) {
			mrepo.deleteById(id);
			
			msg = "Topic Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Topic Id number " + id + " is not found!";
		}
		return msg;	
	}

}
