package com.dcs.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcs.dao.IPartyDAO;
import com.dcs.dto.Party;


@Service
public class IPartyServiceImpl implements IPartyService {
	
	@Autowired
	IPartyDAO ipartyDAO;

	@Autowired
	IPartyDAO icientificoDAO;

	//Listar todos
		public List<Party> listPartys(){
			return ipartyDAO.findAll();
		};
		
		//Listar por id
		public Party partyById(Integer id) {
			return ipartyDAO.findById(id).get();
		}; 
		//Guardar
		public Party saveParty(Party party) {
			return ipartyDAO.save(party);
		};
		//Actualizar
		public Party updateParty(Party party) {
			return ipartyDAO.save(party);
		};
		//Eliminar
		public void deleteByIdParty(Integer id) {
			ipartyDAO.deleteById(id);
		}

		@Override
		public Party findByEmail(String email) {
			// TODO Auto-generated method stub
			return null;
		}
		



}