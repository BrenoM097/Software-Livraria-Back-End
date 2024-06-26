package com.br.project.library.project.controller;

import com.br.project.library.project.dtos.ReserveDTO;
import com.br.project.library.project.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reserve")
public class ReserveController {

    private final ReserveService reserveService;

    @Autowired
    public ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @PostMapping
    public ResponseEntity<String> reserveABook(@RequestBody ReserveDTO reserve) {
        String newReserve = reserveService.borrowBook(reserve);
        return new ResponseEntity<>(newReserve, HttpStatus.CREATED);
    }
}
