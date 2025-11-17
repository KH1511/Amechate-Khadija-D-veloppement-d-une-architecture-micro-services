package com.enset.custumer_service.entities;

import org.springframework.data.rest.core.config.Projection;

//Projection appele "all"
@Projection(name = "all", types = {Costumer.class})
public interface CustomerProjection {

    String getName();
    String getEmail();
}
