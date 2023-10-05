package com.allon.book.store.DTOs;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
    @NotEmpty
    @Size(min = 3, max = 50, message = "'${validatedValue}' tamanho deve ser entre {min} e {max} caracteres.")
    public String name;
}
