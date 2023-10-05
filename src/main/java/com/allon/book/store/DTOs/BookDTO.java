package com.allon.book.store.DTOs;

import com.allon.book.store.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String name;
    private int authorId;
}
