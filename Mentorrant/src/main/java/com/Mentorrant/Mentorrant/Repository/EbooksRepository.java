package com.Mentorrant.Mentorrant.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.EbooksEntity;

@Repository
public interface EbooksRepository extends JpaRepository<EbooksEntity , Integer>{
	
	List<EbooksEntity>findAllBybookgenre(String book_genre);
	
	EbooksEntity findByBooktitle(String book_title);
}
