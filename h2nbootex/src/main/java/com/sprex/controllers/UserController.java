package com.sprex.controllers;

import java.util.ArrayList;

import com.sprex.daocontracts.UserDaoContract;
import com.sprex.log.Log4J;
import com.sprex.models.User;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
// @CrossOrigin(origins = )
public class UserController {
	
	@Autowired
	UserDaoContract restContract;

	// Read
	@GetMapping("/{id}")
	public User findById(@PathVariable("id") int id){
		return restContract.findById(id).orElse(new User());
	}

	@GetMapping("/all")
	public Iterable<User> findAll(){
		if(!restContract.findAll().iterator().hasNext()) return new ArrayList<>();

		return restContract.findAll();
	}

	// Create 
	@PostMapping("/add")
	public String addUser(@RequestBody User u){
		restContract.save(u);
		return u.toString() + "has been added.";
	}

	// Update 
	@PutMapping("/update")
	public String updateUser(@RequestBody User u){
		restContract.save(u);
		return u.toString() + "has been updated.";
	}

	// Delete 
	@DeleteMapping("/delete")
	public String deleteUser(@RequestBody User u){
		restContract.delete(u);
		return u.toString() + "has been deleted.";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable("id") int id){
		restContract.deleteById(id);
		return  "The user with id: " + 
		Integer.toString(id) + 
		" has been deleted.";
	}
}
