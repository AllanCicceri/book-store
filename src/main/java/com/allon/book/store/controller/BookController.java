package com.allon.book.store.controller;

import com.allon.book.store.DTOs.BookDTO;
import com.allon.book.store.model.Book;
import com.allon.book.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;
    @GetMapping
    public List<Book> GetAll(){
        return service.getAll();
    }

    @PostMapping
    public Book Create(@RequestBody BookDTO dto){
        return service.create(dto);
    }
}
