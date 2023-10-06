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
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book create(BookDTO dto) {
        Book book = new Book();
        book.setName(dto.getName());

        Optional<Author> optAuthor = authorRepository.findById(dto.getAuthorId());
        Author author = optAuthor.orElse(null);
        book.setAuthor(author);

        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll(Integer id) {
        if(id == null){
            return bookRepository.findAll();
        }else{
            Author author = authorRepository.findById(id).get();
            return bookRepository.findByAuthor(author);
        }

    }

    @Override
    public Book get(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book update(int id, BookDTO dto) {
        Book book = bookRepository.findById(id).get();
        book.setName(dto.getName());

        Author author = authorRepository.findById(dto.getAuthorId()).get();

        book.setAuthor(author);

        return bookRepository.save(book);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
