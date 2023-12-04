package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "book" , schema = "demodb")
public class Book {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "book_generator")
	@SequenceGenerator(name="book_generator", sequenceName = "demodb.book_id_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "title")
	private String title;
	@Column(name = "price")
	private BigDecimal price;	
	@Column(name = "publish_date")
	private LocalDate publishDate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	
	
	
	public Book(Long id, String title, BigDecimal price, LocalDate publishDate) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}

	public Book(String title, BigDecimal price, LocalDate publishDate) {
		super();
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
	}
	
	public Book(String title, BigDecimal price, LocalDate publishDate, Author author) {
		super();
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
		this.author = author;
	}

	public Book() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	public static Book getDumBook() {
	    return new Book(null,null, null);
	  }
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	

}
