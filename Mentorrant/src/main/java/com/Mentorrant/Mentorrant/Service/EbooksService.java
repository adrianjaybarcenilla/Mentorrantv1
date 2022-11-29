package com.Mentorrant.Mentorrant.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.Mentorrant.Mentorrant.Entity.EbooksEntity;
import com.Mentorrant.Mentorrant.Repository.EbooksRepository;


@Service
public class EbooksService {

	@Autowired
	EbooksRepository ebrepo;
	PagingAndSortingRepository<?, ?> ebsort;

	public EbooksEntity addEbook(EbooksEntity Ebook) {
		return ebrepo.save(Ebook);
	}

	public List<EbooksEntity> getAllEbooks() {
		return ebrepo.findAll();
	}

	public EbooksEntity findByBookTitle(String book_title) {
		if (ebrepo.findByBooktitle(book_title) != null) {
			return ebrepo.findByBooktitle(book_title);
		} else {
			return null;
		}
	}
	public List<EbooksEntity>findAllByBookGenre(String book_genere){
		return ebrepo.findAllBybookgenre(book_genere);
	}
	
	public List<EbooksEntity> findAll(Sort sort){
		return ebrepo.findAll(sort);
	}
	 

	public EbooksEntity updateBook(int id, EbooksEntity newEbook) throws Exception {
		EbooksEntity ebook = new EbooksEntity();

		try {
			ebook = ebrepo.findById(id).get();

			ebook.setBook_title(newEbook.getBook_title());
			ebook.setBook_author(newEbook.getBook_author());
			ebook.setBook_genre(newEbook.getBook_genre());
			ebook.setYear_publish(newEbook.getYear_publish());

			return ebrepo.save(ebook);
		} catch (NoSuchElementException next) {
			throw new Exception("ID Number " + id + " Does Not Exist!");
		}
	}

	public String deleteBook(int id) {
		String msg;

		if (ebrepo.findById(id) != null) {
			ebrepo.deleteById(id);

			msg = "Ebook Id Number " + id + " has been successfully deleted";
		} else {
			msg = "Ebook Id number " + id + " is not found!";
		}
		return msg;
	}
}
