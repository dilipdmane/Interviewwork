package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);
	
	//@Query("SELECT b FROM demodb.book b WHERE b.publish_date > :date")
	List<User> findByFirstNameAndLastName(String firstName,String lastName);

	// Custom query
	//@Query("SELECT b FROM demodb.book b WHERE b.publish_date > :date")
	//List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);

}
