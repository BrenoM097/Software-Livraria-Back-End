package com.br.project.library.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.br.project.library.project.dtos.BookDTO;
import com.br.project.library.project.model.Book;
import com.br.project.library.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/library")
public class BookController {

    private final BookService actions;

    @Autowired
    public BookController(BookService bookService) {
        this.actions = bookService;
    }

    @GetMapping("/book")
    public @ResponseBody List<Book> listAll() {
        return actions.findAll();
    }

    @GetMapping("/book/{id}")
    public @ResponseBody Book listById(@PathVariable int id) {
        return actions.findById(id);
    }

    @PostMapping("/book/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public @ResponseBody Book save(@RequestBody BookDTO book) {
        return actions.save(book);
    }

    @PutMapping("/book/update")
    public @ResponseBody Book update(@RequestBody BookDTO book) {
        return actions.save(book);
    }

    @DeleteMapping("/book/delete/{id}")
    public void delete(@PathVariable int id) {
        actions.deleteById(id);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return errors;
    }
}