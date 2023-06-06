package com.br.project.library.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Livros")
public record Livro (
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="codigo")
     int codigo,
     @Column(name="titulo")
     String titulo,
     @Column(name="autor")
     String autor,
     @Column(name="quantidadePaginas")
     int quantidadePaginas,
     @Column(name="valor")
     Double valor,
     @Column(name="linguagem")
     String linguagem,
     @Column(name="nomeTradutor")
     String nomeTradutor,
     @Column(name="editora")
     String editora,
     @Column(name="dataLancamento")
     String dataLancamento
){}
