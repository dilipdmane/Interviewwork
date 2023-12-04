package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByTitle(String title);

	// Custom query
	//@Query("SELECT b FROM demodb.book b WHERE b.publish_date > :date")
	//List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);

}
