package com.daniel.projeto.full.stack.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.projeto.full.stack.domain.Pedido;
import com.daniel.projeto.full.stack.services.PedidoService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService pedidoService;

	// http://localhost:8080/categorias/{id}
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Pedido obj = pedidoService.find(id);
		return ResponseEntity.ok().body(obj);

	}
}
