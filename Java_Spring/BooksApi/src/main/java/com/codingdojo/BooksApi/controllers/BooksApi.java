package com.codingdojo.BooksApi.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.BooksApi.models.Book;
import com.codingdojo.BooksApi.services.BookService;



@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    @PostMapping(value="/api/books")
    public Book create(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    //update/////////////////////////
    // other methods removed for brevity
    @PostMapping("/api/books/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
    

    //Delete/////////
    @RequestMapping(value="/api/books/delete/{id}")
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
    /*
     * 
     * Get the item to delete from the database
     * pass it to your service.deleteBook(item)
     * In your service, call repository.delete(item)
     */

   



    
}
