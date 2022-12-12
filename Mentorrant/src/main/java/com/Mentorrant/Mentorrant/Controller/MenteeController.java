package com.Mentorrant.Mentorrant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mentorrant.Mentorrant.Entity.MenteeEntity;
import com.Mentorrant.Mentorrant.Service.MenteeService;


@RestController
@RequestMapping("/mentee")
public class MenteeController {
	
	@Autowired
	MenteeService mentsev;
	
	@PostMapping("/postMentee")
	public MenteeEntity addMentee(@RequestBody MenteeEntity mentee) {
		return mentsev.addMentee(mentee);
	}

	@GetMapping("/getAllMentee")
	public List<MenteeEntity>getAllMentee(){
		return mentsev.getAllMentee();
	}
	
	@GetMapping("/getMenteeByStudentFirstName")
	public MenteeEntity getMenteeByStudentFirstName(@RequestParam String firstName){
		return mentsev.findMenteeByStudentFirstName(firstName);
	}
	
	@DeleteMapping("/DeleteMentee/{id}")
	public String deleteMentee(@PathVariable int id) {
		return mentsev.deleteMentee(id);
	}
}
