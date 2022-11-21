package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.MentorEntity;

@Repository
public interface MentorRepository extends JpaRepository<MentorEntity , Integer> {
	
	MentorEntity findByName(String name);
}
