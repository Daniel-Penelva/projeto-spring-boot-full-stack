package com.daniel.projeto.full.stack.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.projeto.full.stack.domain.Cliente;
import com.daniel.projeto.full.stack.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
   
   @Autowired
   private ClienteService clienteService;
	
	// http://localhost:8080/clientes/{id}
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Cliente obj = clienteService.find(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
