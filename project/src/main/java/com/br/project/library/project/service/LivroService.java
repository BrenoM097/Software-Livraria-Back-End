package com.br.project.library.project.service;

import com.br.project.library.project.model.Livro;
import com.br.project.library.project.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LivroService {

    private final LivroRepository repository;

    @Autowired
    public LivroService (LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> findAll() {
        return repository.findAll();
    }

    public Livro findById(int id) {
        return repository.findById(id);
    }

    public Livro save(Livro livro) {
       return repository.save(livro);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
