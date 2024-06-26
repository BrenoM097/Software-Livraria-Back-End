package com.br.project.library.project.model;

import com.br.project.library.project.dtos.BookDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="Book")
@Getter
@Setter
public class Book {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @Column(unique = true)
     private int SKU;
     @NotBlank(message = "Title not specified.")
     private String title;
     @NotBlank(message = "Author not specified.")
     private String author;
     private int pageCount;
     private Double price;
     @NotBlank(message = "Language not specified.")
     private String language;
     private String translatorName;
     private String publisher;
     private LocalDate releaseDate;

     public Book(BookDTO bookDTO) {
          this.SKU = bookDTO.getSKU();
          this.title = bookDTO.getTitle();
          this.author = bookDTO.getAuthor();
          this.pageCount = bookDTO.getPageCount();
          this.price = bookDTO.getPrice();
          this.language = bookDTO.getLanguage();
          this.translatorName = bookDTO.getTranslatorName();
          this.publisher = bookDTO.getPublisher();
          this.releaseDate = bookDTO.getReleaseDate();
     }
}
