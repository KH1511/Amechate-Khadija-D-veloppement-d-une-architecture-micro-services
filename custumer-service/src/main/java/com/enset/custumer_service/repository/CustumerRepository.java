package com.enset.custumer_service.repository;

import com.enset.custumer_service.entities.Costumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Pour utiliser springData : extends JpoRepository

//cette annotation permet de demander a sprint de demarrer automatiquement un web service RESTfAll qui permet d'acceder a toutes les methode qui se trouve dans cette interface
@RepositoryRestResource

public interface CustumerRepository extends CrudRepository<Costumer, Long> {
}

//MAintenant on a tous les methodes CRUD qui permet de generer les customers



