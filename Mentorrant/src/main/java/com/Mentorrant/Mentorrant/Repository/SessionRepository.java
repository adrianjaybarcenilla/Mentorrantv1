package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.SessionEntity;

@Repository
public interface SessionRepository extends JpaRepository <SessionEntity, Integer> {
	SessionEntity findBySessionId(int sessionId);
}
