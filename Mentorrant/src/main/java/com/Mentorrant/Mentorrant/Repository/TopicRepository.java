package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.TopicEntity;

@Repository
public interface TopicRepository extends JpaRepository<TopicEntity, Integer>{
	
	TopicEntity findBysubject(String subject);
}
