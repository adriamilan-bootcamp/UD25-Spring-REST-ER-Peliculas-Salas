package com.adriamilan.cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.cine.dto.Sala;
import com.adriamilan.cine.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaService;
	
	@GetMapping("/salas")
	public List<Sala> listSalas() {
		return salaService.listSalas();
	}
	
	@GetMapping("/sala/{id}")
	public Sala salaXID(@PathVariable(name="id") Long id) {
		return salaService.salaXID(id);
	}
	
	@PostMapping("/sala")
	public Sala saveSala(@RequestBody Sala sala) {
		return salaService.saveSala(sala);
	}
	
	@PutMapping("/sala/{id}")
	public Sala editSala(@PathVariable(name="id") Long id, @RequestBody Sala sala) {
		Sala salaSelected = new Sala();
		Sala salaUpdated = new Sala();
		
		salaSelected = salaService.salaXID(id);
		salaSelected.setNombre(sala.getNombre());
		salaSelected.setPelicula(sala.getPelicula());
		
		salaUpdated = salaService.saveSala(salaSelected);
		
		return salaUpdated;
	}
	
	@DeleteMapping("/sala/{id}")
	public void deleteSala(@PathVariable(name="id") Long id) {
		salaService.deleteSala(id);
	}
	
}
