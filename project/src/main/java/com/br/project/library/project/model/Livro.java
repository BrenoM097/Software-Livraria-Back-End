package com.br.project.library.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Livros")
public class Livro {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="codigo")
     private int codigo;

     @Column(name="titulo")
     private String titulo;

     @Column(name="autor")
     private String autor;

     @Column(name="quantidadePaginas")
     private int quantidadePaginas;

     @Column(name="valor")
     private Double valor;

     @Column(name="linguagem")
     private String linguagem;

     @Column(name="nomeTradutor")
     private String nomeTradutor;

     @Column(name="editora")
     private String editora;

     @Column(name="dataLancamento")
     private String dataLancamento;
}
