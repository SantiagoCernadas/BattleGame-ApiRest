package com.example.HeroGameBattleApi.Model;

import java.util.List;

public class EnfrentamientoModel {
	private String titulo;
	private List<String> RelatoBatalla;
	private String Ganador;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<String> getRelatoBatalla() {
		return RelatoBatalla;
	}
	public void setRelatoBatalla(List<String> relatoBatalla) {
		RelatoBatalla = relatoBatalla;
	}
	public String getGanador() {
		return Ganador;
	}
	public void setGanador(String ganador) {
		Ganador = ganador;
	}
	
	
}
