package com.br.project.library.project.service;

import com.br.project.library.project.dtos.BookDTO;
import com.br.project.library.project.model.Book;
import com.br.project.library.project.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository repository) {
        this.bookRepository = repository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(int id) {
        return bookRepository.findById(id);
    }

    public Book save(BookDTO book) {
        Book newBook = new Book(book);
       return bookRepository.save(newBook);
    }

    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }

}
