package com.br.project.library.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Livros")
@Data
public class Livro {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int codigo;

     private String titulo;
     private String autor;
     private int quantidadePaginas;
     private Double valor;
     private String linguagem;
     private String nomeTradutor;
     private String editora;
     private String dataLancamento;
}
