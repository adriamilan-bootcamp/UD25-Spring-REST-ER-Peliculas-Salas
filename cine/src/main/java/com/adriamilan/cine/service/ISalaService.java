package com.adriamilan.cine.service;

import java.util.List;

import com.adriamilan.cine.dto.Sala;

public interface ISalaService {

	public List<Sala> listSalas();
	
	public Sala salaXID(Long id);
	
	public Sala saveSala(Sala sala);
	
	public Sala editSala(Sala sala);
	
	public void deleteSala(Long id);
	
}
