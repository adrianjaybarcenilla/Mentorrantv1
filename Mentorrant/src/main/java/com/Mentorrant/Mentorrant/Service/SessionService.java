package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.SessionEntity;
import com.Mentorrant.Mentorrant.Repository.SessionRepository;

@Service
public class SessionService {
	
	@Autowired
	SessionRepository srepo;
	
	public SessionEntity addSession(SessionEntity session) {
		return srepo.save(session);
	}
	
	public List<SessionEntity>getAllSession(){
		return srepo.findAll();
	}
	
	public SessionEntity findBySessionDescription(String sessionDescription) {
		if(srepo.findBySessionDescription(sessionDescription) != null) {
			return srepo.findBySessionDescription(sessionDescription);
		}else {
			return null;
		}
	}
	
	public SessionEntity updateSession(int id, SessionEntity newSession) throws Exception{
		SessionEntity session = new SessionEntity();
		
		try {
			session = srepo.findById(id).get();
			
			session.setDateTime(newSession.getDateTime());
			session.setSessionDescription(newSession.getSessionDescription());
			return srepo.save(session);
		} catch(NoSuchElementException next) {
			throw new Exception ("Session Id" + id + " Does Not Exist!");
		}
	}
	
	public String deleteSession(int id) {
		String msg;
		
		if(srepo.findById(id) != null) {
			srepo.deleteById(id);
			
			msg = "Session Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Session Id number " + id + " is not found!";
		}
		return msg;	
	}
}
