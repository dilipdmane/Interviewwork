package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;
import com.example.demo.valueobject.AuthorVO;

@RestController
@RequestMapping("/authors")
public class AuthorController {

//	@GetMapping("/")
//	public String welcome()
//	{
//		return "index";
//	}
	
	@Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public List<Author> findAll() {    	
        return  authorService.findAll();
    }
    
    
    @PostMapping("/")
    public ResponseEntity<Author> add(@RequestBody AuthorVO authorVO) throws Exception {
        Author dumAuthor = Author.getDumAuthor();
      BeanUtils.copyProperties(authorVO, dumAuthor);;
      authorService.save(dumAuthor);
      return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @GetMapping("/getBooks/{id}")
    public ResponseEntity<Collection<Book>>  getBooks(@PathVariable(name = "id") String id) {
    	Optional<Author> findById = authorService.findById(Long.valueOf(id).longValue());
    	List<Book> bookList = new ArrayList<Book>(); 
    	if(findById.isPresent())
    	{
    		Author author = findById.get();
    		bookList = author.getBookList();
    	}
    	return bookList.size() > 0 ? new ResponseEntity<>(bookList, HttpStatus.OK)
    	        : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    	
    	
    }
}
