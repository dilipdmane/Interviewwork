package com.example.demo.valueobject;

public class AuthorVO {
	
	private String firstName;
	private String lastName;
	private String country;
	
	
	
	public AuthorVO(String firstName, String lastName, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
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
	
	


	
	

}
