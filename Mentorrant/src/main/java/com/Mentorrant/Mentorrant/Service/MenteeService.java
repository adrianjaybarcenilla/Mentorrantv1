package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.MenteeEntity;
import com.Mentorrant.Mentorrant.Entity.StudentEntity;
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
	
	public MenteeEntity findMenteeByStudentFirstName(String firstName) {
		if(mrepo.findMenteeByStudentFirstName(firstName) != null) {
			return mrepo.findMenteeByStudentFirstName(firstName);			
		}else {
			return null;
		}
	}
	
	public String deleteMentee(int id) {
		String msg;
		
		if(mrepo.findById(id) != null) {
			mrepo.deleteById(id);
			
			msg = "Ebook Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Ebook Id number " + id + " is not found!";
		}
		return msg;	
	}
}
