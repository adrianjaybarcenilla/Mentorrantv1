package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.MentorEntity;
import com.Mentorrant.Mentorrant.Repository.MentorRepository;

@Service
public class MentorService {

	@Autowired
	MentorRepository mRepo;
	
	public MentorEntity addMentor(MentorEntity mentor) {
		return mRepo.save(mentor);
	}
	
	public List<MentorEntity> getAllMentors(){
		return mRepo.findAll();
	}
	
	public MentorEntity findByName(String name) {
		if(mRepo.findByName(name) != null) {
			return mRepo.findByName(name);
		}else {
			return null;
		}
	}
	
	public MentorEntity updateMentor(int id , MentorEntity newMentor) throws Exception{
		MentorEntity mentor = new MentorEntity();
		
		try {
			mentor = mRepo.findById(id).get();
			
			mentor.setStudentId(newMentor.getStudentId());
			mentor.setName(newMentor.getName());
			mentor.setRating(newMentor.getRating());
			mentor.setCourseId(newMentor.getCourseId());
			
			return mRepo.save(mentor);
		} catch(NoSuchElementException next) {
			throw new Exception ("ID Number " + id + " Does Not Exist!");
		}
	}
	
	public String deleteMentor(int id) {
		String msg;
		
		if(mRepo.findById(id) != null) {
			mRepo.deleteById(id);
			
			msg = "Mentor Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Mentor Id number " + id + " is not found!";
		}
		return msg;	
	}
}
