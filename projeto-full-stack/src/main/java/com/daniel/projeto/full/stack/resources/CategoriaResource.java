package com.daniel.projeto.full.stack.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.projeto.full.stack.domain.Categoria;
import com.daniel.projeto.full.stack.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
   
   @Autowired
   private CategoriaService categoriaService;
	
	// http://localhost:8080/categorias
	@GetMapping
	public List<Categoria> listar(){
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
	
	
	// http://localhost:8080/categorias/{id}
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Categoria obj = categoriaService.find(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
