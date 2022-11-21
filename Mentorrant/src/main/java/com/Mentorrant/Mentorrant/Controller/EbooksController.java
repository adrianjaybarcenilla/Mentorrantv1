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

import com.Mentorrant.Mentorrant.Entity.EbooksEntity;
import com.Mentorrant.Mentorrant.Service.EbooksService;


@RestController
@RequestMapping("/Ebooks")
public class EbooksController {

	@Autowired
	EbooksService ebserve;
	
	@PostMapping("/postEbooks")
	public EbooksEntity addEbook(@RequestBody EbooksEntity book) {
		return ebserve.addEbook(book);
	}

	@GetMapping("/get")
	public List<EbooksEntity>getAllEbooks(){
		return ebserve.getAllEbooks();
	}
	
	@GetMapping("/getByBookName")
	public EbooksEntity findbyBookName(@RequestParam String bookName) {
		return ebserve.findbyBookName(bookName);
	}
	
	@GetMapping("/getByBookGenre")
	public EbooksEntity findbyGenre(@RequestParam String genre) {
		return ebserve.findbyGenre(genre);
	}
	
	@PutMapping("/UpdateEbook")
	public EbooksEntity updateBook(@RequestParam int id , @RequestBody EbooksEntity newEbook) throws Exception{
		return ebserve.updateBook(id, newEbook);
	}
	
	@DeleteMapping("/DeleteEbook/{id}")
	public String deleteBook(@PathVariable int id) {
		return ebserve.deleteBook(id);
	}
}