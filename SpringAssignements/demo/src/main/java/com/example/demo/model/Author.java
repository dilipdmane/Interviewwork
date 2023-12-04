package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "author" , schema = "demodb")
public class Author {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "demodb.author_id_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;	
	@Column(name = "country")
	private String country;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Book> bookList;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String firstName, String lastName, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}


	public Author(Long id, String firstName, String lastName, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	public static Author getDumAuthor() {
		// TODO Auto-generated method stub
		return new Author(null, null, null);
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}
	
	
	
	
	
	
	
	
	

}
