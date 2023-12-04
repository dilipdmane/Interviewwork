package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> findAll()
	{
		return authorRepository.findAll();
	}
	
    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    public List<Author> findByFirstName(String firstName) {
        return authorRepository.findByFirstName(firstName);
    }
    
    public List<Author> findByFirstNameAndLastNameAndCountry(String firstName,String lastName,String country) {
        return authorRepository.findByFirstNameAndLastNameAndCountry(firstName,lastName, country);
    }


}
