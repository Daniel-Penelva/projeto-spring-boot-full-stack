package com.daniel.projeto.full.stack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.projeto.full.stack.domain.Pedido;
import com.daniel.projeto.full.stack.repositories.PedidoRepository;
import com.daniel.projeto.full.stack.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	// Método buscar categoria por id
	public Pedido find(Integer id) {

		Optional<Pedido> obj = pedidoRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado -> Id: " + id + ", Tipo: " + Pedido.class.getName()));

	}
}
