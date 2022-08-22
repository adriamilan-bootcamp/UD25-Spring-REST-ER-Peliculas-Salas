package com.adriamilan.cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.cine.dao.ISalaDAO;
import com.adriamilan.cine.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO salaDao;

	@Override
	public List<Sala> listSalas() {
		return salaDao.findAll();
	}

	@Override
	public Sala salaXID(Long id) {
		return salaDao.findById(id).get();
	}

	@Override
	public Sala saveSala(Sala sala) {
		return salaDao.save(sala);
	}

	@Override
	public Sala editSala(Sala sala) {
		return salaDao.save(sala);
	}

	@Override
	public void deleteSala(Long id) {
		salaDao.deleteById(id);
	}
	
}
