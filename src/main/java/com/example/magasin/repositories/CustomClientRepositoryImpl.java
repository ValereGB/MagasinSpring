package com.example.magasin.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.magasin.models.ClientDTO;

@Repository
public class CustomClientRepositoryImpl implements CustomClientRepository{

    private final NamedParameterJdbcTemplate jdbcTemplate;

    private static final String SEARCH_CLIENT = "SELECT nom, prenom FROM Client";

    @Autowired
    public CustomClientRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ClientDTO> findClientNomPrenom() {
        Map<String, String> queryParams= new HashMap<>();
        List<ClientDTO> studentDtos= jdbcTemplate.query(SEARCH_CLIENT, new BeanPropertyRowMapper<>(ClientDTO.class));

        return studentDtos;
    }

}