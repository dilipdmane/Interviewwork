package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Bean
	@ConditionalOnProperty(prefix = "app", name = "db.init.enabled", havingValue = "true")
	public CommandLineRunner commandLineRunner()
	{
		return args->{
			System.out.println("Running.....");
			Author author = new Author("Dilip", "Mane", "India");
			authorRepository.save(author);
			
			  Book b1 = new Book("Book Of Spring",
	                    BigDecimal.valueOf(9.99),
	                    LocalDate.of(2023, 8, 31),author);
			  
			  bookRepository.save(b1);
	            
	            
		};
	}

}
