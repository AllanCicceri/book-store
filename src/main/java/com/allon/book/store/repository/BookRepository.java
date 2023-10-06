package com.allon.book.store.repository;

import com.allon.book.store.model.Author;
import com.allon.book.store.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByAuthor(Author authorId);
    List<Book> findByAuthorNome(String nome);
}
