package com.dcs.service;

import java.util.List;

import com.dcs.dto.Game;


public interface IGameService {
	
	//Listar todos
	public List<Game> listGames();
	
	//Listar por id
	public Game gameById(Integer id); 
	
	//Guardar
	public Game saveGame(Game Game);
	
	//Actualizar
	public Game updateGame(Game Game);
	
	//Eliminar
	public void deleteByIdGame(Integer id);

	public Game findByEmail(String email);

	
}