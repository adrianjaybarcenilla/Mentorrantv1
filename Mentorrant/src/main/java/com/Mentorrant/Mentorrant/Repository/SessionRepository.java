package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mentorrant.Mentorrant.Entity.SessionEntity;

public interface SessionRepository extends JpaRepository <SessionEntity, Integer> {
	SessionEntity findBySessionId(int sessionId);
}
