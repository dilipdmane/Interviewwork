package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;
import com.example.demo.service.BookService;
import com.example.demo.valueobject.BookVO;

@RestController
@RequestMapping("/books")
public class BookController {

//	@GetMapping("/")
//	public String welcome()
//	{
//		return "index";
//	}
	
	@Autowired
    private BookService bookService;
	
	@Autowired
	private AuthorService authorService;

    @GetMapping("/")
    public List<Book> findAll() {    	
        return  bookService.findAll();
    }
    
    
    @PostMapping("/")
    public ResponseEntity<Book> add(@RequestBody BookVO bookVO) throws Exception {
      Book dumBook = Book.getDumBook();
      BeanUtils.copyProperties(bookVO, dumBook);;
      List<Author> authors = authorService.
    		  findByFirstNameAndLastNameAndCountry(bookVO.getAuthor().getFirstName(), 
    				  bookVO.getAuthor().getLastName(), 
    				  bookVO.getAuthor().getCountry());
      if (authors.isEmpty())
	  {
    	  Author dumAuthor = Author.getDumAuthor();
    	  BeanUtils.copyProperties(bookVO.getAuthor(), dumAuthor);
    	  dumAuthor= authorService.save(dumAuthor);
    	  dumBook.setAuthor(dumAuthor);
	  }
      else
      {
    	  dumBook.setAuthor(authors.get(0));
      }
      bookService.save(dumBook);
      return new ResponseEntity<>(HttpStatus.CREATED);     
      
    }
}
