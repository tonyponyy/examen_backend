package com.dcs.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcs.dao.IGameDAO;
import com.dcs.dto.Game;


@Service
public class IGameServiceImpl implements IGameService {
	
	@Autowired
	IGameDAO igameDAO;

	@Autowired
	IGameDAO icientificoDAO;

	//Listar todos
		public List<Game> listGames(){
			return igameDAO.findAll();
		};
		
		//Listar por id
		public Game gameById(Integer id) {
			return igameDAO.findById(id).get();
		}; 
		//Guardar
		public Game saveGame(Game game) {
			return igameDAO.save(game);
		};
		//Actualizar
		public Game updateGame(Game game) {
			return igameDAO.save(game);
		};
		//Eliminar
		public void deleteByIdGame(Integer id) {
			igameDAO.deleteById(id);
		}

		@Override
		public Game findByEmail(String email) {
			// TODO Auto-generated method stub
			return null;
		}
		



}