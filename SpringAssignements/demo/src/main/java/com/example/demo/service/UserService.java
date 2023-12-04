package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.InvalidUserException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
	
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findByFirstNameAndLastName(String firstName, String lastName) throws Exception {
    	List<User> userList = userRepository.findByFirstNameAndLastName(firstName, lastName);
    	if( userList.isEmpty() ) 
    		{
    			Object[] args = {firstName, lastName};
    			throw new InvalidUserException("invalidUser",args);
    		}
        
        return userList;
    }


}
