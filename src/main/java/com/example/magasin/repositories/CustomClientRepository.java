package com.example.magasin.repositories;

import java.util.List;

import com.example.magasin.models.ClientDTO;

public interface CustomClientRepository {
	public List<ClientDTO> findClientNomPrenom();
}
