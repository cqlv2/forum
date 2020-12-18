package dev.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.repositories.UserRepository;

@Service
public class UserService {

	
	UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public ResponseEntity<?> getAll(){
		return null;
	}
}
