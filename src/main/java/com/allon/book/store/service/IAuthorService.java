package com.allon.book.store.service;

import com.allon.book.store.DTOs.AuthorDTO;
import com.allon.book.store.model.Author;

import java.util.List;

public interface IAuthorService {
    Author create(AuthorDTO author);
    List<Author> getAll();
    Author get(int id);
    Author update(int id);
    void delete(int id);
}
