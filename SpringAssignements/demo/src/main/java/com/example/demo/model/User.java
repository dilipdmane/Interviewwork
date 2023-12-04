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
@Table(name = "user" , schema = "demodb")
public class User {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user_generator")
	@SequenceGenerator(name="user_generator", sequenceName = "demodb.user_id_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;	
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<BookInventory> bookInventories;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String firstName, String lastName, String password,String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}


	public User(Long id, String firstName, String lastName, String password, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
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


	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public static User getDummyUser()
	{
		return new User();
	}
	
	
	
	
	
	
	

}
