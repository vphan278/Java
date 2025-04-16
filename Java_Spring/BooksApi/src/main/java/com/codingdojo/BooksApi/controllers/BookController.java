package com.codingdojo.BooksApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.BooksApi.models.Book;
import com.codingdojo.BooksApi.services.BookService;



@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String index(@PathVariable("bookId") Long bookId, Model model) {
		
		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		System.out.println(book);
		
		return "index.jsp";
	 }

	
	//return all books
	@RequestMapping("/books")
	public String show(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "show.jsp";
	}
	
	//Form to  book
	@GetMapping("/books/new")
	public String newBook() {
		return "NewBook.jsp";
	}
	
	
	
	
	
}
