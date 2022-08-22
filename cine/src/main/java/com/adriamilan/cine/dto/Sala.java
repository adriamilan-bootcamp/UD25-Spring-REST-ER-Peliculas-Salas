package com.adriamilan.cine.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="pelicula")
	private Pelicula pelicula;
	
	// Constructor por defecto
	public Sala() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param pelicula
	 */
	public Sala(Long id, String nombre, Pelicula pelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
	
}
