package com.example.HeroGameBattleApi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.HeroGameBattleApi.Entity.Personaje;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje,Long>{
	
	@Query(
	value = "SELECT * FROM personaje order by id",		
	nativeQuery = true		
	)
	List<Personaje> findAll();
}
