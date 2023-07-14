package com.filipefbf.fbflist.controllers;

import com.filipefbf.fbflist.dto.GameDTO;
import com.filipefbf.fbflist.dto.GameListDTO;
import com.filipefbf.fbflist.dto.GameMinDTO;
import com.filipefbf.fbflist.services.GameListService;
import com.filipefbf.fbflist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id) {
		GameListDTO result = gameListService.findById(id);
		return result;
	}

}
