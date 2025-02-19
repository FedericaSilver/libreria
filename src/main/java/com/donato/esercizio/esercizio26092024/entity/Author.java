package com.donato.esercizio.esercizio26092024.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "author")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Column(name = "name", nullable = false)
    private String name;
    @Setter
    @Column(name = "surname", nullable = false)
    private String surname;
    @Setter
    @Column(name = "biography")
    private String biography;


    public Author(String name, String surname, String biography) {
        this.name = name;
        this.surname = surname;
        this.biography = biography;
    }
}
/*
Entità:
Author: rappresenta un autore con attributi come id, name, biography.

AuthorController:
Aggiungere un nuovo autore.
Ottenere tutti gli autori.

AuthorService --> Da creare
 */
