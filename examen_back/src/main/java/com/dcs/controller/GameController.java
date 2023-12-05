package com.dcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcs.dto.Game;
import com.dcs.service.IGameServiceImpl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/games")
public class GameController {
	
	
	@Autowired
	private IGameServiceImpl gameServiceImpl;
	
	@Autowired
	private EntityManager entityManager;

	@GetMapping("/all")
	public List<Game> listarGames(){
		return gameServiceImpl.listGames();
	}
	@PostMapping("/add")
	public Game salvargame(@RequestBody Game game) {
		return gameServiceImpl.saveGame(game);
	}
	@GetMapping("/{id}")
	public Game gameXID(@PathVariable(name="id") Integer id) {
		Game game_xid= new Game();	
		game_xid=gameServiceImpl.gameById(id);
		return game_xid;
	}
	

	
	@PutMapping("/update")
	public Game actualizargame(@RequestBody Game game) {
		Game game_seleccionado = new Game();

	    if (game.getName() != null) {
	        game.setName(game.getName());
	    }
	    
	    Game game_updated = gameServiceImpl.updateGame(game);
	    return game_updated;
	}
	
	@DeleteMapping("/{id}")
	public void eliminargame(@PathVariable(name="id")Integer id) {
		gameServiceImpl.deleteByIdGame(id);
	}
	
}