package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;
import com.example.demo.model.BookInventory;
import com.example.demo.model.User;

public interface BookInventoryRepository extends JpaRepository<BookInventory, Long> {

	List<BookInventory> findByUser(User user);
	List<BookInventory> findByBook(Book book);
	List<BookInventory> findByUserAndBook(User user, Book book);
	List<BookInventory> findByBookAndIsreturned(Book book,boolean isReturned);

}
