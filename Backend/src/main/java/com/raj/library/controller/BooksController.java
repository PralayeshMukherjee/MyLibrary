package com.raj.library.controller;

import com.raj.library.DTO.BookAdd;
import com.raj.library.Service.BookService;
import com.raj.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBooks")
    public Map<String,Boolean> addNewBook(@RequestBody BookAdd bookAdd){
        String title = bookAdd.getTitle();
        int price = Integer.parseInt(bookAdd.getPrice());
        String stocks = bookAdd.getStocks();
        String author = bookAdd.getAuthor();
        boolean isAdded =  bookService.addBooks(title,price,stocks,author);
        return Map.of("isAdded", isAdded);
    }
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        List<Book> allBooks = bookService.getBooks();
        System.out.println(allBooks);
        return allBooks;
    }
}
