package com.example.HeroGameBattleApi.Service;

import java.util.ArrayList;

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
		enfrentamiento.setRelatoBatalla(new ArrayList<>());
		
		Personaje p1  = personajeRepository.findById(idPerUno).get();
		Personaje p2  = personajeRepository.findById(idPerDos).get();
		
		enfrentamiento.setTitulo(p1.getNombre() + " contra " + p2.getNombre());
		enfrentamiento.getRelatoBatalla().add(setEstadisticaMensaje(p1.getFuerza(),p2.getFuerza(),"fuerza",p1.getNombre(),p2.getNombre()));
		enfrentamiento.getRelatoBatalla().add(setEstadisticaMensaje(p1.getVelocidad(),p2.getVelocidad(),"velocidad",p1.getNombre(),p2.getNombre()));
		enfrentamiento.getRelatoBatalla().add(setEstadisticaMensaje(p1.getAgilidad(),p2.getAgilidad(),"agilidad",p1.getNombre(),p2.getNombre()));
		enfrentamiento.getRelatoBatalla().add(setEstadisticaMensaje(p1.getResistencia(),p2.getResistencia(),"resistencia",p1.getNombre(),p2.getNombre()));
		enfrentamiento.getRelatoBatalla().add(setEstadisticaMensaje(p1.getInteligencia(),p2.getInteligencia(),"inteligencia",p1.getNombre(),p2.getNombre()));
		enfrentamiento.setGanador(obtenerGanador(p1,p2));
		
		return enfrentamiento;
	}
	
	public String setEstadisticaMensaje(Integer est1, Integer est2, String nombreEst, String nombre1,String nombre2) {
		if(est1 == est2) {
			return "ambos tienen la misma " + nombreEst + "(" + est1 + " puntos";
		}
		else if(est1 > est2) {
			return nombre1 + " tiene mas " + nombreEst + " que " + nombre2 + "(" + (est1 - est2) + " puntos de diferencia)";
		}
		else {
			return nombre2 + " tiene mas " + nombreEst + " que " + nombre1 + "(" + (est2 - est1) + " puntos de diferencia)";
		}
	}

	public String obtenerGanador(Personaje per1, Personaje per2) {
		
		if(per1.getSumatoriaEstadisticas() - per2.getSumatoriaEstadisticas() == 0) {
			return "Empate. Ambos tienen " + per1.getSumatoriaEstadisticas() + " puntos de estadistica";
		}
		else if(per1.getSumatoriaEstadisticas() > per2.getSumatoriaEstadisticas()) {
			return per1.getNombre() + " le gana a " + per2.getNombre() + " por " + (per1.getSumatoriaEstadisticas() - per2.getSumatoriaEstadisticas()) + " puntos de diferencia.";
		}
		else {
			return per2.getNombre() + " le gana a " + per1.getNombre() + " por " + (per2.getSumatoriaEstadisticas() - per1.getSumatoriaEstadisticas()) + " puntos de diferencia.";
		}
	}
	
}
