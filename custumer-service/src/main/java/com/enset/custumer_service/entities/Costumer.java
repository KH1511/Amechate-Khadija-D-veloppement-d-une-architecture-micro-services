package com.enset.custumer_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

//Cad la claase corresspond a une table au niveau de la base de donnees
@Entity
//Constructeur sans parametres
@NoArgsConstructor
//Constructeur avec tous les parametres
@AllArgsConstructor
//Getters et Setters
@Getter  @Setter
//Pour creer l'objet
@Builder

public class Costumer {
    @Id
    //Valeur de id soit genere automatiquement (a chauq e fois il va incrementer de 1 (identity))
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

}
