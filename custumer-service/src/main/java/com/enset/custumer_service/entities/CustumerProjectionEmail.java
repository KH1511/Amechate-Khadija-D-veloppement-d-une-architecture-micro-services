package com.enset.custumer_service.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "email", types = Costumer.class)
public interface CustumerProjectionEmail {
    String getEmail();

}
