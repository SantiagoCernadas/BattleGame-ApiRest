package com.example.HeroGameBattleApi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.HeroGameBattleApi.Entity.Personaje;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje,Long>{

}
