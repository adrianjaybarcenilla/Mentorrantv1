package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.EbooksEntity;
import com.Mentorrant.Mentorrant.Repository.EbooksRepository;

@Service
public class EbooksService {
	
	@Autowired
	EbooksRepository ebrepo;
	
	public EbooksEntity addEbook(EbooksEntity book) {
		return ebrepo.save(book);
	}
	
	public List<EbooksEntity>getAllEbooks(){
		return ebrepo.findAll();
	}
	
	public EbooksEntity findbyBookName(String bookName) {
		if(ebrepo.findByName(bookName) != null) {
			return ebrepo.findByName(bookName);
		}else {
			return null;
		}
	}
	
	public EbooksEntity findbyGenre(String genre) {
		if(ebrepo.findByGenre(genre) != null) {
			return ebrepo.findByGenre(genre);			
		}else {
			return null;
		}
	}
	
	public EbooksEntity updateBook(int id , EbooksEntity newEbook) throws Exception{
		EbooksEntity ebook = new EbooksEntity();
		
		try {
			ebook = ebrepo.findById(id).get();
			
			ebook.setBookAuthor(newEbook.getBookAuthor());
			ebook.setBookGenre(newEbook.getBookGenre());
			ebook.setyearPublish(newEbook.getyearPublish());
			
			return ebrepo.save(ebook);
		} catch(NoSuchElementException next) {
			throw new Exception ("ID Number " + id + " Does Not Exist!");
		}
	}
	
	public String deleteBook(int id) {
		String msg;
		
		if(ebrepo.findById(id) != null) {
			ebrepo.deleteById(id);
			
			msg = "Ebook Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Ebook Id number " + id + " is not found!";
		}
		return msg;	
	}
}
