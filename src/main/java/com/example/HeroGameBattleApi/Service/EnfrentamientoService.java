package com.example.HeroGameBattleApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HeroGameBattleApi.Entity.Personaje;
import com.example.HeroGameBattleApi.Model.EnfrentamientoModel;
import com.example.HeroGameBattleApi.Repository.PersonajeRepository;

@Service
public class EnfrentamientoService {
	
	@Autowired
	PersonajeRepository personajeRepository;
	
	public EnfrentamientoModel enfrentarse(Long idPerUno, Long idPerDos) {
		EnfrentamientoModel enfrentamiento = new EnfrentamientoModel();
		Personaje primerPersonaje  = personajeRepository.findById(idPerUno).get();
		Personaje SegundoPersonaje  = personajeRepository.findById(idPerDos).get();
		enfrentamiento.titulo = primerPersonaje.getNombre() + " contra " + SegundoPersonaje.getNombre();
		return enfrentamiento;
	}
	

}
