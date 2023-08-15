package com.daniel.projeto.full.stack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.projeto.full.stack.domain.Categoria;
import com.daniel.projeto.full.stack.repositories.CategoriaRepository;
import com.daniel.projeto.full.stack.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	// Método buscar categoria por id
	public Categoria find(Integer id) {
		
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado -> Id: " + id +
					", Tipo: " + Categoria.class.getName()));
		
	}
}
