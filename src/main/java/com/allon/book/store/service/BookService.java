package com.allon.book.store.service;

import com.allon.book.store.DTOs.BookDTO;
import com.allon.book.store.model.Author;
import com.allon.book.store.model.Book;
import com.allon.book.store.repository.AuthorRepository;
import com.allon.book.store.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService{
    @Autowired
    private BookRepository repository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book create(BookDTO dto) {
        Book book = new Book();
        book.setName(dto.getName());

        Optional<Author> optAuthor = authorRepository.findById(dto.getAuthorId());
        Author author = optAuthor.orElse(null);
        book.setAuthor(author);

        return repository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override
    public Book get(int id) {
        return null;
    }

    @Override
    public Book update(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
