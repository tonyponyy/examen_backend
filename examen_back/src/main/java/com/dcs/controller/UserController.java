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

import com.dcs.dto.User;
import com.dcs.service.IUserServiceImpl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private IUserServiceImpl userServiceImpl;
	
	@Autowired
	private EntityManager entityManager;

	@GetMapping("/all")
	public List<User> listarUsers(){
		return userServiceImpl.listUsers();
	}
	@PostMapping("/add")
	public User salvaruser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}
	@GetMapping("/{id}")
	public User userXID(@PathVariable(name="id") Integer id) {
		User user_xid= new User();	
		user_xid=userServiceImpl.userById(id);
		return user_xid;
	}
	

	
	@PutMapping("/update")
	public User actualizaruser(@RequestBody User user) {
		User user_seleccionado = new User();

	    if (user.getName() != null) {
	        user.setName(user.getName());
	    }
	    
	    if (user.getPassword() != null) {
	        user.setPassword(user.getPassword());
	    }

	    if (user.getEmail() != null) {
	        user.setEmail(user.getEmail());
	    }

	    User user_updated = userServiceImpl.updateUser(user);
	    return user_updated;
	}
	
	@DeleteMapping("/{id}")
	public void eliminaruser(@PathVariable(name="id")Integer id) {
		userServiceImpl.deleteByIdUser(id);
	}
	
}