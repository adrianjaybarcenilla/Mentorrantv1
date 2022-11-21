package com.Mentorrant.Mentorrant.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ebooks")
public class EbooksEntity {
	
	private int bookId;
	private String bookAuthor;
	private String bookGenre;
	private int yearPublish;
	
	public EbooksEntity() {}

	public EbooksEntity(int bookId, String bookAuthor, String bookGenre, int yearPublish) {
		super();
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.yearPublish = yearPublish;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public int getyearPublish() {
		return yearPublish;
	}

	public void setyearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}
}
