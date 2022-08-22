package com.adriamilan.cine.service;

import java.util.List;

import com.adriamilan.cine.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listPeliculas();
	
	public Pelicula peliculaXID(Long id);
	
	public Pelicula savePelicula(Pelicula pelicula);
	
	public Pelicula editPelicula(Pelicula pelicula);
	
	public void deletePelicula(Long id);
	
}
