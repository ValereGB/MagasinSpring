package com.example.magasin.services;

import java.util.List;
import java.util.Optional;

import com.example.magasin.models.Client;
import com.example.magasin.models.ClientDTO;

public interface ClientService {
	public List<Client> trouverTousClients();
    public Optional<Client> findById(Long aLong);

    public void deleteById(Long aLong);
    public Client save(Client entity);
    public List<ClientDTO> findDTO();
}
