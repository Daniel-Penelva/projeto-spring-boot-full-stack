package com.daniel.projeto.full.stack.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	// http://localhost:8080/categorias
	@GetMapping
	public String listar(){
		return "Testando REST está funcionando!";
	}

}
