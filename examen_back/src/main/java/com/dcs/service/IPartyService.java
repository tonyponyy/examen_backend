package com.dcs.service;

import java.util.List;

import com.dcs.dto.Party;


public interface IPartyService {
	
	//Listar todos
	public List<Party> listPartys();
	
	//Listar por id
	public Party partyById(Integer id); 
	
	//Guardar
	public Party saveParty(Party Party);
	
	//Actualizar
	public Party updateParty(Party Party);
	
	//Eliminar
	public void deleteByIdParty(Integer id);

	public Party findByEmail(String email);

	
}