package com.example.magasin.services.impl;

import java.util.List;
import java.util.Optional;

import com.example.magasin.models.Client;
import com.example.magasin.models.ClientDTO;
import com.example.magasin.repositories.ClientRepository;
import com.example.magasin.repositories.CustomClientRepository;
import com.example.magasin.services.ClientService;

public class ClientServiceImpl implements ClientService {

	private ClientRepository repository;
	private CustomClientRepository customRepo;

	public ClientServiceImpl(ClientRepository repository, CustomClientRepository customRepo) {
		this.repository = repository;
		this.customRepo = customRepo;
	}

	@Override
	public List<Client> trouverTousClients() {
		return this.repository.findAll();
	}

	public Optional<Client> findById(Long aLong) {
		return this.repository.findById(aLong);
	}

	public void deleteById(Long aLong) {
		this.repository.deleteById(aLong);
	}

	public Client save(Client entity) {
		return this.repository.save(entity);
	}

	public List<ClientDTO> findDTO() {
		return this.customRepo.findClientNomPrenom();
	}
}
