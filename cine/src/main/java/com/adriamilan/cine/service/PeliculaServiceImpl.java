package com.adriamilan.cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.cine.dao.IPeliculaDAO;
import com.adriamilan.cine.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {
	
	@Autowired
	IPeliculaDAO peliculaDao;

	@Override
	public List<Pelicula> listPeliculas() {
		return peliculaDao.findAll();
	}

	@Override
	public Pelicula peliculaXID(Long id) {
		return peliculaDao.findById(id).get();
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		return peliculaDao.save(pelicula);
	}

	@Override
	public Pelicula editPelicula(Pelicula pelicula) {
		return peliculaDao.save(pelicula);
	}

	@Override
	public void deletePelicula(Long id) {
		peliculaDao.deleteById(id);
	}
	
}
