package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ebooks")
public class EbooksEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	
	private String booktitle;
	private String bookauthor;
	private String bookgenre;
	private int yearpublish;
	
	public EbooksEntity() {}
	
	public EbooksEntity(int book_id, String book_title, String book_author, String book_genre, int year_publish) {
		super();
		this.bookid = book_id;
		this.booktitle = book_title;
		this.bookauthor = book_author;
		this.bookgenre = book_genre;
		this.yearpublish = year_publish;
	}

	public int getBook_id() {
		return bookid;
	}

	public String getBook_title() {
		return booktitle;
	}

	public void setBook_title(String book_title) {
		this.booktitle = book_title;
	}

	public String getBook_author() {
		return bookauthor;
	}

	public void setBook_author(String book_author) {
		this.bookauthor = book_author;
	}

	public String getBook_genre() {
		return bookgenre;
	}

	public void setBook_genre(String book_genre) {
		this.bookgenre = book_genre;
	}

	public int getYear_publish() {
		return yearpublish;
	}

	public void setYear_publish(int year_publish) {
		this.yearpublish = year_publish;
	}
	

}
