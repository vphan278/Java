package com.codingdojo.JpaDemo.services;

import java.util.List;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.JpaDemo.models.Book;
import com.codingdojo.JpaDemo.repositories.BookRepository;



@Service
public class BookService {
 
	//adding the book repository as a dependency
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	//return all the books
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	
	//create a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	//update a book
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}
	
	//retrieve a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		else {
			return null;
		}
	}
	
	//Search a book "by description"
	public List<Book> bookSearch(String search){
		return bookRepository.findByDescriptionContaining(search);
		
	}
	
	//delete
	
	
	
	
}

