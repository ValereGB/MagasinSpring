package com.example.magasin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.example.magasin.repositories.ClientRepository;
import com.example.magasin.repositories.CustomClientRepository;
import com.example.magasin.repositories.CustomClientRepositoryImpl;
import com.example.magasin.services.ClientService;
import com.example.magasin.services.impl.ClientServiceImpl;

@Configuration
public class ClientConfig {

    @Bean
    public ClientService clientService(ClientRepository repo, CustomClientRepository customRepo){
        return new ClientServiceImpl(repo, customRepo);
    }

    @Bean
    @Primary
    public CustomClientRepository customClientRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        return new CustomClientRepositoryImpl(jdbcTemplate);
    }
}