package com.Mentorrant.Mentorrant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mentorrant.Mentorrant.Entity.MentorEntity;
import com.Mentorrant.Mentorrant.Service.MentorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/mentors")
public class MentorController {
	
	@Autowired
	MentorService mServe;
	
	@PostMapping("/postMentors")
	public MentorEntity addMentor(@RequestBody MentorEntity mentor) {
		return mServe.addMentor(mentor);
	}

	@GetMapping("/getAllMentors")
	public List<MentorEntity>getAllMentors(){
		return mServe.getAllMentors();
	}
	
	@GetMapping("/getByName")
	public MentorEntity findMentorByStudentMentorFirstName(@RequestParam String name) throws Exception {
		return mServe.findMentorByStudentFirstName(name);
	}
	
	@PutMapping("/updateMentor")
	public MentorEntity updateMentor(@RequestParam int id , @RequestBody MentorEntity newMentor) throws Exception{
		return mServe.updateMentor(id, newMentor);
	}
	
	@DeleteMapping("/deleteMentor/{id}")
	public String deleteMentor(@PathVariable int id) {
		return mServe.deleteMentor(id);
	}
	
}
