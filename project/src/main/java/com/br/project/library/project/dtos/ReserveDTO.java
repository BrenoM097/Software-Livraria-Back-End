package com.br.project.library.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class ReserveDTO {
    private int id;
    private int bookId;
    private LocalDate initialDate;
    private LocalDate finalDate;
}
