package com.peceguini.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peceguini.course.entites.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> FindAll (){
		User u = new User(1L , "Maria", "GarciaMari@gmail.com","99999","12345");
		return ResponseEntity.ok().body(u);
	}

}
