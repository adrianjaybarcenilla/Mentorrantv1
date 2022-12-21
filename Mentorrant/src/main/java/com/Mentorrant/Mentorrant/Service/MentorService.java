package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.MentorEntity;
import com.Mentorrant.Mentorrant.Entity.StudentEntity;
import com.Mentorrant.Mentorrant.Repository.MentorRepository;
import com.Mentorrant.Mentorrant.Repository.StudentRepository;

@Service
public class MentorService {

	@Autowired
	MentorRepository mRepo;
	@Autowired
	StudentRepository srepo;
	
	public MentorEntity addMentor(MentorEntity mentor) {
		return mRepo.save(mentor);
	}

	public List<MentorEntity> getAllMentors(){
		return mRepo.findAll();
	}
	
	public MentorEntity findMentorByStudentFirstName(String firstName) throws Exception{
		if(srepo.findByFirstName(firstName) != null) {
			StudentEntity student = srepo.findByFirstName(firstName);
			return mRepo.findByStudentId(student.getStudentId());
		}else {
			throw new Exception("There is no student having the name " + firstName + " in the database");
		}
	}
	
	public MentorEntity updateMentor(int id , MentorEntity newMentor) throws Exception{
		MentorEntity mentor = new MentorEntity();
		
		try {
			mentor = mRepo.findById(id).get();
			
			mentor.setCourseId(newMentor.getCourseId());
			mentor.setMentorId(newMentor.getCourseId());
			mentor.setRating(newMentor.getRating());
			mentor.setStudentId(newMentor.getStudentId());
			
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
