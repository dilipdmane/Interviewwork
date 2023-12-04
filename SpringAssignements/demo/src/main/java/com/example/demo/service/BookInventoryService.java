package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.BookNotAvailableException;
import com.example.demo.common.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.model.BookInventory;
import com.example.demo.repository.BookInventoryRepository;

@Service
public class BookInventoryService {
	
	@Autowired
	private BookInventoryRepository bookInventoryRepository;
	
	public List<BookInventory> findAll()
	{
		return bookInventoryRepository.findAll();
	}
	
    public Optional<BookInventory> findById(Long id) {
        return bookInventoryRepository.findById(id);
    }

    public BookInventory save(BookInventory bookInventory) throws Exception {
    	findByBookAvailble(bookInventory.getBook());
        return bookInventoryRepository.save(bookInventory);
    }

    public void deleteById(Long id) {
        bookInventoryRepository.deleteById(id);
    }
    
    

    public List<BookInventory> findByBookAvailble(Book book) throws Exception{
    	List<BookInventory> bookList = bookInventoryRepository.findByBook(book);
    	if( ! bookList.isEmpty()  &&  !bookInventoryRepository.findByBookAndIsreturned(book, false).isEmpty()) 
		{
			Object[] args = {book.getTitle()};
			throw new BookNotAvailableException("bookUnavailbale",args);
		}    	
        return bookList;
    }
    
    

}
