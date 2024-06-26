package com.br.project.library.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class BookDTO {
    private int SKU;
    private String title;
    private String author;
    private int pageCount;
    private Double price;
    private String language;
    private String translatorName;
    private String publisher;
    private LocalDate releaseDate;
}
