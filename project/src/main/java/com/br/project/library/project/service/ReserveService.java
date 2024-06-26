package com.br.project.library.project.service;

import com.br.project.library.project.dtos.ReserveDTO;
import com.br.project.library.project.model.Book;
import com.br.project.library.project.model.Reserve;
import com.br.project.library.project.repositories.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class ReserveService {
    private final ReserveRepository repository;
    private final BookService bookService;

    @Autowired
    public ReserveService(ReserveRepository repository, BookService bookService) {
        this.repository = repository;
        this.bookService = bookService;

    }

    public String borrowBook(ReserveDTO reserve) {
        Book book = bookService.findById(reserve.getBookId());

        if(isTheBookAvailable(book.getId(), reserve.getInitialDate())) {
            Reserve newReserve = new Reserve(reserve);
            repository.save(newReserve);
            return book.getTitle() + " reservado com sucesso!";
        }
        return "Book indisponivel para essa data, " + book.getTitle() +
                 " estará disponivel na data " + this.bookGetAvailableDate(book);
    }

    private Boolean isTheBookAvailable(int bookId, LocalDate reserveDate) {
        Reserve date = repository.findFirstByBookIdOrderByIdDesc(bookId);
        return reserveDate.isAfter(date.getFinalDate());

    }

    private LocalDate bookGetAvailableDate(Book book) {
        return repository.findFirstByBookIdOrderByIdDesc(book.getId()).getFinalDate();
    }
}
