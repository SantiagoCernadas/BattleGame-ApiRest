package com.example.HeroGameBattleApi.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HeroGameBattleApi.Entity.Personaje;
import com.example.HeroGameBattleApi.Service.PersonajeService;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {
	@Autowired
	PersonajeService personajeService;
	
	@GetMapping()
	public ArrayList<Personaje> obtenerPersonajes(){
		return personajeService.obtenerPersonajes();
	}
	
	@PostMapping()
	public Personaje guardarPersonaje(@RequestBody Personaje personaje) {
		return personajeService.guardarPersonaje(personaje);
	}
	
	@GetMapping("/{id}")
	public Personaje obtenerPersonaje(@PathVariable("id") Long id) {
		return personajeService.obtenerPersonaje(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPersonaje(@PathVariable("id") Long id) {
		if(personajeService.eliminarPersonaje(id)) {
			return "se elimino el personaje correctamente.";
		}
		else {
			return "no se pudo eliminar el personaje :(";
		}
	}
}
