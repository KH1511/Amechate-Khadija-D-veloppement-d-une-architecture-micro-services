package com.enset.custumer_service;

import com.enset.custumer_service.entities.Costumer;
import com.enset.custumer_service.repository.CustumerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustumerServiceApplication.class, args);
	}

    //Pour executer un traitement au demarrage
    @Bean
    CommandLineRunner commandLineRunner (CustumerRepository custumerRepository){
        return args -> {
            custumerRepository.save(Costumer.builder()
                    .name("Khadija").email("khadija@gamil.com").build());
            custumerRepository.save(Costumer.builder()
                    .name("Chayma").email("chayma@gamil.com").build());
            custumerRepository.save(Costumer.builder()
                    .name("Meryem").email("meryem@gamil.com").build());

            custumerRepository.findAll().forEach(c->{
                System.out.println("#######################");
                System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());

            });
        };

    }
}
