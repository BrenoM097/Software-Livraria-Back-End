package com.br.project.library.project.repositories;

import com.br.project.library.project.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Integer> {

    Reserve findFirstByBookIdOrderByIdDesc(int bookId);
}

