package com.daniel.projeto.full.stack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.projeto.full.stack.domain.Cliente;
import com.daniel.projeto.full.stack.repositories.ClienteRepository;
import com.daniel.projeto.full.stack.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	// Método buscar categoria por id
	public Cliente find(Integer id) {
		
		Optional<Cliente> obj = clienteRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado -> Id: " + id +
					", Tipo: " + Cliente.class.getName()));
		
	}
}
