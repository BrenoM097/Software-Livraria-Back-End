package com.br.project.library.project.repositories;

import java.util.List;

import com.br.project.library.project.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAll();

    Book findById(int Id);

    void delete(Book book);

    <BookMod extends Book> BookMod save(BookMod livro);
}