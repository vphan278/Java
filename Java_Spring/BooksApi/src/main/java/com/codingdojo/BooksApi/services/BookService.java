package com.codingdojo.BooksApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.BooksApi.models.Book;
import com.codingdojo.BooksApi.repositories.BookRepository;

@Service
public class BookService {
	 // adding the book repository as a dependency
	 private final BookRepository bookRepository;
	 
	 public BookService(BookRepository bookRepository) {
	     this.bookRepository = bookRepository;
	 }
	 // returns all the books
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 // creates a book
	 public Book createBook(Book b) {
	     return bookRepository.save(b);
	 }
	 
	 
	 // retrieves a book
	 public Book findBook(Long id) {
	     Optional<Book> optionalBook = bookRepository.findById(id);
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } else {
	         return null;
	     }
	 }
	 
	 // this method finds books with descriptions containing the search string
	 public List<Book> bookSearch(String search){
		 return bookRepository.findByDescriptionContaining(search);
	 }
	 
	 //update a book
	 public Book updateBook(Book b) {
	     return bookRepository.save(b);
	 }
	 
	 //delete a book
	 public void deleteBook(Long id) {
		 // load the item to be deleted
		 bookRepository.deleteById(id); // pass item here
	 }
	 
}

