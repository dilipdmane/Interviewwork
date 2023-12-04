package com.example.demo.model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

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
@Table(name = "bookinventory" , schema = "demodb")
public class BookInventory {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bookinventory_generator")
	@SequenceGenerator(name="bookinventory_generator", sequenceName = "demodb.bookinventory_id_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	
	@Column(name = "start_date")
	private LocalDate startDate;	
	@Column(name = "end_date")
	private LocalDate endDate;
	@Column(name = "is_returned")
	private boolean isreturned;
	
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "bid")
	private Book book;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;
	
	public BookInventory() {	}
	
	public BookInventory(LocalDate startDate, LocalDate endDate, boolean isreturned)
	{
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.isreturned = isreturned;
	}

	public BookInventory(LocalDate startDate, LocalDate endDate, boolean isreturned, Book book, User user) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.isreturned = isreturned;
		this.book = book;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean isIsreturned() {
		return isreturned;
	}

	public void setIsreturned(boolean isreturned) {
		this.isreturned = isreturned;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public static BookInventory getDummeyBookInventory()
	{
		return new BookInventory(LocalDate.now(), LocalDate.now().plusWeeks(3), false);
	}
	
	
	

	
	
	
	
	
	

}
