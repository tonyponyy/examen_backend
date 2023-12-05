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

import com.dcs.dto.Party;
import com.dcs.service.IPartyServiceImpl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/partys")
public class PartyController {
	
	
	@Autowired
	private IPartyServiceImpl partyServiceImpl;
	
	@Autowired
	private EntityManager entityManager;

	@GetMapping("/all")
	public List<Party> listarPartys(){
		return partyServiceImpl.listPartys();
	}
	@PostMapping("/add")
	public Party salvarparty(@RequestBody Party party) {
		return partyServiceImpl.saveParty(party);
	}
	@GetMapping("/{id}")
	public Party partyXID(@PathVariable(name="id") Integer id) {
		Party party_xid= new Party();	
		party_xid=partyServiceImpl.partyById(id);
		return party_xid;
	}
	

	
	@DeleteMapping("/{id}")
	public void eliminarparty(@PathVariable(name="id")Integer id) {
		partyServiceImpl.deleteByIdParty(id);
	}
	
}