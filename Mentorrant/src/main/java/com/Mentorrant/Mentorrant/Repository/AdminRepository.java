package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity , Integer>{

	AdminEntity findByName(String name);
	
	AdminEntity findByExpertise(String expertise);
}
