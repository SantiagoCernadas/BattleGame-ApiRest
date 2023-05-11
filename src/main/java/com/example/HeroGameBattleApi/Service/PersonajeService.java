package com.example.HeroGameBattleApi.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HeroGameBattleApi.Entity.Personaje;
import com.example.HeroGameBattleApi.Repository.PersonajeRepository;

@Service
public class PersonajeService {
	@Autowired
	PersonajeRepository personajeRepository;
	
	public ArrayList<Personaje> obtenerPersonajes(){
		return (ArrayList<Personaje>)personajeRepository.findAll();
	}
	
	public Personaje guardarPersonaje(Personaje personaje) {
		return personajeRepository.save(personaje);
	}
	
	public boolean eliminarPersonaje(Long id) {
		try {
			personajeRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
