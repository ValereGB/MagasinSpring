package com.example.magasin.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.magasin.models.Client;
import com.example.magasin.models.ClientDTO;
import com.example.magasin.services.ClientService;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

//	private static LOGGER = LoggerFactory.getLogger(ClientController.class);
			
	@Autowired
	private ClientService service;

	@GetMapping("")
	public List<Client> trouverTousClients() {
		return service.trouverTousClients();
	}

	@GetMapping("{id}")
	public Optional<Client> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}

	@PostMapping("")
	@PutMapping("")
	public Client save(@RequestBody Client entity) {
		return service.save(entity);
	}

	@GetMapping("dto")
	public List<ClientDTO> findDto() {
		return this.service.findDTO();
	}
}
