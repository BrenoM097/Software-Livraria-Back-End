package com.br.project.library.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.br.project.library.project.model.Livro;
import com.br.project.library.project.repository.LivroRepositorio;


@RestController
@RequestMapping("/api")
public class LivroController {

    //Ações
    @Autowired
    private LivroRepositorio acoes;
    
   // Consultar todos os Livros
    @GetMapping("/livros")
    public @ResponseBody List<Livro> listarTodos() {
        return acoes.findAll();
    }

    //Consultar por ID
    @GetMapping("/livros/{id}")
    public @ResponseBody Livro listarPorID(@PathVariable int id) {
        return acoes.findById(id);
    }
  
    //Cadastrar Livros
    @PostMapping("/livros/cadastrar")
    @ResponseStatus(code = HttpStatus.CREATED)
    public @ResponseBody Livro cadastrar(@RequestBody Livro livro) {
        return acoes.save(livro);
    }

    //Alterar Livros
    @PutMapping("/livros/alterar")
    public @ResponseBody Livro alterar(@RequestBody Livro livro) {
        return acoes.save(livro);
    }

    //Deletar Livro
    @DeleteMapping("/livros/{id}")
    public void deletar(@PathVariable int id) {
        acoes.deleteById(id);
    }
}