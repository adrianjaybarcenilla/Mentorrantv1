package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.MenteeEntity;
import com.Mentorrant.Mentorrant.Repository.MenteeRepository;

@Service
public class MenteeService {
	@Autowired
	MenteeRepository mrepo;
	
	public MenteeEntity addMentee(MenteeEntity mentee) {
		return mrepo.save(mentee);
	}

	public List<MenteeEntity>getAllMentee(){
		return mrepo.findAll();
	}
	
	public MenteeEntity findbyName(String name)throws Exception {
		if(mrepo.findByName(name) != null) {
			return mrepo.findByName(name);
		}else {
			return null;
		}
	}
	
	public MenteeEntity updateMentee(int id, MenteeEntity newMentee) throws Exception{
		MenteeEntity mentee = new MenteeEntity();
		
		try {
			mentee = mrepo.findById(id).get();
			
			mentee.setStudentId(newMentee.getStudentId());
			mentee.setCourseId(newMentee.getCourseId());
			
			return mrepo.save(mentee);
		} catch(NoSuchElementException next) {
			throw new Exception ("ID Number " + id + " Does Not Exist!");
		}
	}
	
	public String deleteMentee(int id) {
		String msg;
		
		if(mrepo.findById(id) != null) {
			mrepo.deleteById(id);
			
			msg = "Mentee Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Mentee Id number " + id + " is not found!";
		}
		return msg;	
	}
}
