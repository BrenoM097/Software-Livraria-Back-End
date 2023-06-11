package com.br.project.library.project.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.project.library.project.model.Livro;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Integer> {
    List<Livro> findAll();

    Livro findById(int Id);

    void delete(Livro livro);

    <LivroMod extends Livro> LivroMod save(LivroMod livro); 
}