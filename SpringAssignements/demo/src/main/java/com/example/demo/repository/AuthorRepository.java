package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	List<Author> findByFirstName(String firstName);
	List<Author> findByLastName(String lastName);
	
	//@Query("SELECT b FROM demodb.book b WHERE b.publish_date > :date")
	List<Author> findByFirstNameAndLastNameAndCountry(String firstName,String lastName,String country);

	// Custom query
	//@Query("SELECT b FROM demodb.book b WHERE b.publish_date > :date")
	//List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);

}
