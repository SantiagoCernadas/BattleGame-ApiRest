package com.example.HeroGameBattleApi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personaje")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true,nullable= false)
	private Long id;
	
	
	private String nombre;
	private Integer fuerza;
	private Integer velocidad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getFuerza() {
		return fuerza;
	}
	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}
	public Integer getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	
	

}
