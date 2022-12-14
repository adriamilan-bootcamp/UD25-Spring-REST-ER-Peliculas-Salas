package com.adriamilan.cine.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="calificacionEdad")
	private int calificacionEdad;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
	private List<Sala> salas;
	
	// Constructor por defecto
	public Pelicula() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param calificacionEdad
	 */
	public Pelicula(Long id, String nombre, int calificacionEdad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
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
	 * @return the calificacionEdad
	 */
	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	/**
	 * @param calificacionEdad the calificacionEdad to set
	 */
	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return salas;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.salas = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad + "]";
	}
	
}