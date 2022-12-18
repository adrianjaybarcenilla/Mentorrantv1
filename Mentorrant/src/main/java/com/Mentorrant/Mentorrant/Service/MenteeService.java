package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.MenteeEntity;
import com.Mentorrant.Mentorrant.Entity.SessionEntity;
import com.Mentorrant.Mentorrant.Entity.StudentEntity;
import com.Mentorrant.Mentorrant.Repository.MenteeRepository;
import com.Mentorrant.Mentorrant.Repository.StudentRepository;

@Service
public class MenteeService {
	@Autowired
	MenteeRepository mrepo;
	@Autowired
	StudentRepository srepo;
	
	public MenteeEntity addMentee(MenteeEntity mentee) {
		return mrepo.save(mentee);
	}

	public List<MenteeEntity>getAllMentee(){
		return mrepo.findAll();
	}
	
	public MenteeEntity findMenteeByFirstName(String firstName) {
		if(srepo.findByFirstName(firstName) != null) {
			StudentEntity student = srepo.findByFirstName(firstName);
			return mrepo.findByStudentId(student.getStudentId());			
		}else {
			return null;
		}
	}
	
	public MenteeEntity updateMentee(int id, MenteeEntity newMentee) throws Exception{
		MenteeEntity mentee = new MenteeEntity();
		
		try {
			mentee = mrepo.findById(id).get();
			
			mentee.setStudentId(newMentee.getStudentId());
			return mrepo.save(mentee);
		} catch(NoSuchElementException next) {
			throw new Exception ("Mentee Id" + id + " Does Not Exist!");
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
