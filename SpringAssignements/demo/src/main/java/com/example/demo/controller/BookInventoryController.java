package com.example.demo.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.BookNotAvailableException;
import com.example.demo.common.BookNotFoundException;
import com.example.demo.common.InvalidUserException;
import com.example.demo.model.Book;
import com.example.demo.model.BookInventory;
import com.example.demo.model.User;
import com.example.demo.service.BookInventoryService;
import com.example.demo.service.BookService;
import com.example.demo.service.UserService;
import com.example.demo.valueobject.BookInventoryVO;

@RestController
@RequestMapping("/bookinventory")
public class BookInventoryController {

	
	@Autowired
    private UserService userService;
	
	@Autowired
    private BookService bookService;
	
	@Autowired
	private BookInventoryService bookInventoryService;
	
	protected static final Logger logger = Logger.getLogger(BookInventoryController.class.getName());

    @GetMapping("/")
    public List<BookInventory> findAll() {    	
        return  bookInventoryService.findAll();
    }
    
    @PostMapping("/")
    public ResponseEntity<BookInventory> reserveBook(@RequestBody BookInventoryVO bookInventoryVO) throws Exception{
    	BookInventory dummeyBookInventory = BookInventory.getDummeyBookInventory();
    	try {
    		List<User> users = userService.findByFirstNameAndLastName(bookInventoryVO.getUser().getFirstName(), bookInventoryVO.getUser().getLastName());
    		dummeyBookInventory.setUser( users.get(0));
    		List<Book> books = bookService.findByTitle(bookInventoryVO.getBook().getTitle());
    		dummeyBookInventory.setBook( books.get(0));    		
    		//bookInventoryService.findByBookAvailble(books.get(0));    		
        	bookInventoryService.save(dummeyBookInventory);
		}
    	catch (InvalidUserException e) {
			logger.log(Level.WARNING, "Exception raised reserve book REST Call {0}", e);
		      throw e;
		}
    	catch (BookNotFoundException e) {
			logger.log(Level.WARNING, "Exception raised reserve book REST Call", e);
		      throw e;
		}
    	catch (BookNotAvailableException e) {
			logger.log(Level.WARNING, "Exception raised reserve book REST Call", e);
		      throw e;
		}
    	catch (Exception e) {
			logger.log(Level.WARNING, "Exception raised reserve book REST Call", e);
		      throw e;
		}    	
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    
    
}
