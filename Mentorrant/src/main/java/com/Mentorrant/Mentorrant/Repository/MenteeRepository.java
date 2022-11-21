package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.MenteeEntity;

@Repository
public interface MenteeRepository extends JpaRepository<MenteeEntity, Integer>{
	
	MenteeEntity findByName(String name);
}