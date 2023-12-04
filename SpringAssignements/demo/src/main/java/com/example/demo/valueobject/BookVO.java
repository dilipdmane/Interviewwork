package com.example.demo.valueobject;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BookVO {
	
	private String title;
	private BigDecimal price;
	private LocalDate publishDate;
	private AuthorVO author;
	
	public BookVO(String title, BigDecimal price, LocalDate publishDate,AuthorVO author) {
		super();
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
		this.author = author;
	}

	public BookVO(String title, BigDecimal price, LocalDate publishDate) {
		super();
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}
	public BookVO() {}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	
	public AuthorVO getAuthor() {
		return author;
	}
	
	public void setAuthor(AuthorVO author) {
		this.author = author;
	}
	
	

}
