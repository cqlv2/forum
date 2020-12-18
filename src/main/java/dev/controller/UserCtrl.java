package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserCtrl {

	private UserService userServ;

	public UserCtrl(UserService userServ) {
		super();
		this.userServ = userServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(userServ.getAll());
	}
	
}
