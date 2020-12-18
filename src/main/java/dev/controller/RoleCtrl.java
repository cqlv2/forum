package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.services.RoleService;

@RestController
@CrossOrigin
@RequestMapping("role")
public class RoleCtrl {

	RoleService roleServ;

	public RoleCtrl(RoleService roleServ) {
		super();
		this.roleServ = roleServ;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(roleServ.getAll());
	}
	
}
