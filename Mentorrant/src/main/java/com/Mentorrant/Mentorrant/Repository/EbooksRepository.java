package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.EbooksEntity;

@Repository
public interface EbooksRepository extends JpaRepository<EbooksEntity , Integer>{

	EbooksEntity findByBookGenre(String bookGenre);
	
	EbooksEntity findByBookTitle(String bookTitle);
}
