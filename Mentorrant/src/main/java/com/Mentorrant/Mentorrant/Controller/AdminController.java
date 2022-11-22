package com.Mentorrant.Mentorrant.Controller;

import java.util.List;

import org.hibernate.service.Service;
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

import com.Mentorrant.Mentorrant.Entity.AdminEntity;
import com.Mentorrant.Mentorrant.Service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService aserve;
	
	@PostMapping("/postAdmin")
	public AdminEntity addAdmin(@RequestBody AdminEntity admin) {
		return aserve.addAdmin(admin);
	}

	@GetMapping("/get")
	public List<AdminEntity>getAllAdmin(){
		return aserve.getAllAdmins();
	}
	
	@GetMapping("/getByAdminName")
	public AdminEntity findByName(@RequestParam String name) {
		return aserve.findByName(name);
	}
	
	@GetMapping("/getByExpertise")
	public AdminEntity findByExpertise(@RequestParam String expertise) {
		return aserve.findByExpertise(expertise);
	}
	
	@PutMapping("/putAdmin")
	public AdminEntity updateAdmin(@RequestParam int adminId , @RequestBody AdminEntity newAdmin) throws Exception{
		return aserve.updateAdmin(adminId, newAdmin);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable int adminId) {
		return aserve.deleteAdmin(adminId);
	}
}
