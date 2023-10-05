package com.allon.book.store.service;

import com.allon.book.store.DTOs.BookDTO;
import com.allon.book.store.model.Book;
import java.util.List;

public interface IBookService {
    Book create(BookDTO dto);
    List<Book> getAll();
    Book get(int id);
    Book update(int id);
    void delete(int id);

}
