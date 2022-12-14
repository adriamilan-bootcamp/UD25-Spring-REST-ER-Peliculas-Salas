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

import com.adriamilan.cine.dto.Pelicula;
import com.adriamilan.cine.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaService;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listPeliculas() {
		return peliculaService.listPeliculas();
	}
	
	@GetMapping("/pelicula/{id}")
	public Pelicula peliculaXID(@PathVariable(name="id") Long id) {
		return peliculaService.peliculaXID(id);
	}
	
	@PostMapping("/pelicula")
	public Pelicula savePelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.savePelicula(pelicula);
	}
	
	@PutMapping("/pelicula/{id}")
	public Pelicula editPelicula(@PathVariable(name="id") Long id, @RequestBody Pelicula pelicula) {
		Pelicula peliculaSelected = new Pelicula();
		Pelicula peliculaUpdated = new Pelicula();
		
		peliculaSelected = peliculaService.peliculaXID(id);
		peliculaSelected.setNombre(pelicula.getNombre());
		peliculaSelected.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		peliculaUpdated = peliculaService.savePelicula(peliculaSelected);
		
		return peliculaUpdated;
	}
	
	@DeleteMapping("/pelicula/{id}")
	public void deletePelicula(@PathVariable(name="id") Long id) {
		peliculaService.deletePelicula(id);
	}
	
	
}
