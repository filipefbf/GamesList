package com.filipefbf.fbflist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipefbf.fbflist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
