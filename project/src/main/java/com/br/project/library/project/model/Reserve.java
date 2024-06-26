package com.br.project.library.project.model;

import com.br.project.library.project.dtos.ReserveDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@DynamicUpdate
@NoArgsConstructor
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int bookId;
    private LocalDate initialDate;
    private LocalDate finalDate;

    public Reserve(ReserveDTO data) {
        this.id = data.getId();
        this.bookId = data.getBookId();
        this.initialDate = data.getInitialDate();
        this.finalDate = data.getFinalDate();
    }
}
