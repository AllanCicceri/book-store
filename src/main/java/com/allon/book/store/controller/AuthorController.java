package com.allon.book.store.controller;

import com.allon.book.store.DTOs.AuthorDTO;
import com.allon.book.store.model.Author;
import com.allon.book.store.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService service;

    @GetMapping
    public List<Author> GetAll()
    {
        return  service.getAll();
    }

    @PostMapping
    public Author Create(@Valid @RequestBody AuthorDTO dto){
        return service.create(dto);
    }
}
