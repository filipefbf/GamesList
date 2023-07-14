package com.filipefbf.fbflist.services;

import com.filipefbf.fbflist.dto.GameDTO;
import com.filipefbf.fbflist.dto.GameListDTO;
import com.filipefbf.fbflist.dto.GameMinDTO;
import com.filipefbf.fbflist.entities.Game;
import com.filipefbf.fbflist.entities.GameList;
import com.filipefbf.fbflist.repositories.GameListRepository;
import com.filipefbf.fbflist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public GameListDTO findById(Long id) {
		GameList result = gameListRepository.findById(id).get();
		return new GameListDTO(result);

	}
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
