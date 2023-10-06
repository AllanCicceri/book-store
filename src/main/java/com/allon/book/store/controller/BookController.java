package com.allon.book.store.controller;

import com.allon.book.store.DTOs.BookDTO;
import com.allon.book.store.model.Book;
import com.allon.book.store.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;
    @GetMapping
    public List<Book> GetAll(@RequestParam(value = "authorId", required = false) Integer id, @RequestParam(value = "nome", required = false) String nome)
    {
        if(nome != null){
            return service.getAll(nome);
        }

        return service.getAll(id);

    }

    @GetMapping("/{id}")
    public Book GetById(@PathVariable int id){return service.get(id);}

    @PostMapping
    public Book Create(@RequestBody BookDTO dto){
        return service.create(dto);
    }

    @PostMapping("/{id}")
    public Book Update(@PathVariable int id, @Valid @RequestBody BookDTO dto) {return service.update(id, dto);}

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable int id){service.delete(id);}
}
