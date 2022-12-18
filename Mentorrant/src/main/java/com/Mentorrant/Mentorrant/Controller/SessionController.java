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

import com.Mentorrant.Mentorrant.Entity.SessionEntity;
import com.Mentorrant.Mentorrant.Service.SessionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/session")
public class SessionController{
	
	@Autowired
	SessionService seserv;
	
	@PostMapping("/postSession")
	public SessionEntity addSession(@RequestBody SessionEntity session) {
		return seserv.addSession(session);
	}

	@GetMapping("/getAllSession")
	public List<SessionEntity>getAllSession(){
		return seserv.getAllSession();
	}
	
	@GetMapping("/getBySessionDescription")
	public SessionEntity findBySessionDescription(@RequestParam String sessionDescription) {
		return seserv.findBySessionDescription(sessionDescription);
	}
	

	@PutMapping("/UpdateSession")
	public SessionEntity update(@RequestParam int id , @RequestBody SessionEntity newSession) throws Exception{
		return seserv.updateSession(id, newSession);
	}
	
	@DeleteMapping("/DeleteSession/{id}")
	public String deleteSession(@PathVariable int id) {
		return seserv.deleteSession(id);
	}
}