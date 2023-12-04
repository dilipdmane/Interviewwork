package com.example.demo.valueobject;

public class BookInventoryVO {
	
	private BookVO book;
	private UserVO user;
	
	
	
	
	public BookInventoryVO(BookVO book, UserVO user) {
		super();
		this.book = book;
		this.user = user;
		
	}
	public BookVO getBook() {
		return book;
	}
	public void setBook(BookVO book) {
		this.book = book;
	}
	public UserVO getUser() {
		return user;
	}
	public void setUser(UserVO user) {
		this.user = user;
	}
	
	
}
