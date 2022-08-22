package com.adriamilan.cine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.cine.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Long> {

}
