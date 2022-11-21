package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.AdminEntity;
import com.Mentorrant.Mentorrant.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository arepo;
	
	public AdminEntity addAdmin(AdminEntity admin) {
		return arepo.save(admin);
	}
	
	public List<AdminEntity>getAllAdmins(){
		return arepo.findAll();
	}
	
	public AdminEntity findByName(String name) {
		if(arepo.findByName(name) != null) {
			return arepo.findByName(name);
		}else {
			return null;
		}
	}
	
	public AdminEntity findByExpertise(String expertise) {
		if(arepo.findByExpertise(expertise) != null) {
			return arepo.findByExpertise(expertise);			
		}else {
			return null;
		}
	}
	
	public AdminEntity updateAdmin(int id , AdminEntity newAdmin) throws Exception{
		AdminEntity admin = new AdminEntity();
		
		try {
			admin = arepo.findById(id).get();
			
			admin.setName(newAdmin.getName());
			admin.setUsername(newAdmin.getUsername());
			admin.setPassword(newAdmin.getPassword());
			admin.setExpertise(newAdmin.getExpertise());
			
			return arepo.save(admin);
		} catch(NoSuchElementException next) {
			throw new Exception ("ID Number " + id + " Does Not Exist!");
		}
	}
	
	public String deleteAdmin(int id) {
		String msg;
		
		if(arepo.findById(id) != null) {
			arepo.deleteById(id);
			
			msg = "Admin Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Admin Id number " + id + " is not found!";
		}
		return msg;	
	}
}
