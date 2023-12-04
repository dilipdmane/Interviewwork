package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.valueobject.BookVO;
import com.example.demo.valueobject.UserVO;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@Autowired
    private UserService userService;
	
	

    @GetMapping("/")
    public List<User> findAll() {    	
        return  userService.findAll();
    }
    
    
    @PostMapping("/")
    public ResponseEntity<Book> add(@RequestBody UserVO user) throws Exception {
    	User dummyUser = User.getDummyUser();
    	BeanUtils.copyProperties(user, dummyUser);
      userService.save(dummyUser);
      return new ResponseEntity<>(HttpStatus.CREATED);     
      
    }
}
