package com.chp.BookStore.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class BookEntity {
	
	@Id
//	@GeneratedValue(strategy = (GenerationType.IDENTITY))
	private long id;
	
	@Column(name = "book_Name")
	private String bookName;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "book_Price")
	private int bookPrice;
//	
//	@Lob
//    @Column(columnDefinition = "MEDIUMBLOB")
//	private byte[] image;

//	public BookEntity(long id, String bookName, String auther, int bookPrice, byte[] image) {
//		super();
//		this.id = id;
//		this.bookName = bookName;
//		this.auther = auther;
//		this.bookPrice = bookPrice;
//		this.image = image;
//	}
	

	public BookEntity() {
		
	}

	public BookEntity(long id, String bookName, String author, int bookPrice) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.author = author;
	this.bookPrice = bookPrice;
}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", bookName=" + bookName + ", author=" + author + ", bookPrice=" + bookPrice
				+ "]";
	}

//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}

//	@Override
//	public String toString() {
//		return "BookEntity [id=" + id + ", bookName=" + bookName + ", auther=" + auther + ", bookPrice=" + bookPrice
////				+ ", image=" + Arrays.toString(image) + "]";
//	}
//	
	
	
	
	
	
	
	
	
	

}
