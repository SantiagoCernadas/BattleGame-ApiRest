package com.example.HeroGameBattleApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HeroGameBattleApi.Model.EnfrentamientoModel;
import com.example.HeroGameBattleApi.Service.EnfrentamientoService;

@RestController
@RequestMapping("/enfrentamiento")
public class EnfrentamientoController {
	@Autowired
	EnfrentamientoService enfrentamientoService;
	
	@GetMapping()
	public EnfrentamientoModel enfrentarse(@RequestParam Long idPerUno,@RequestParam Long idPerDos) {
		EnfrentamientoModel enfrentamiento = enfrentamientoService.enfrentarse(idPerUno,idPerDos);
		return enfrentamiento;
	}
}
