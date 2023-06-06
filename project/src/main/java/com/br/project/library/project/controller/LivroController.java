package com.br.project.library.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.project.library.project.model.Livro;
import com.br.project.library.project.model.LivroRepositorio;

@RestController
@RequestMapping("/api")
public class LivroController {

    //Ações
    @Autowired
    private LivroRepositorio acoes;
    
    //Consultar Livros
    @RequestMapping(value="/livros", method=RequestMethod.GET)
    public @ResponseBody List<Livro> inicio() {
        return acoes.findAll();
    }

}