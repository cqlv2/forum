package dev.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.repositories.RoleRepository;

@Service
public class RoleService {

	RoleRepository roleRepo;

	public RoleService(RoleRepository roleRepo) {
		super();
		this.roleRepo = roleRepo;
	}
	
	public ResponseEntity<?> getAll(){
		return null;
	}
	
	
}
