package com.allon.book.store.service;

import com.allon.book.store.DTOs.AuthorDTO;
import com.allon.book.store.model.Author;
import com.allon.book.store.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private AuthorRepository repository;

    @Override
    public Author create(AuthorDTO dto) {
        Author author = new Author();
        author.setNome(dto.getName());
        return repository.save(author);
    }

    @Override
    public List<Author> getAll() {
        return repository.findAll();
    }

    @Override
    public Author get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Author update(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
